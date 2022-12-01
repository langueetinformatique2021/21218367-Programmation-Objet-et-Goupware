package devoirTD8;

import java.util.ArrayList;

public class LancerDes extends Aleat {
//les attributs
	String lanceur;
	int num;
		
//le constructeur
	public LancerDes(String nom, int number) {
		super(6);
		lanceur = nom;
		num = number;
	}
		
	//une méthode lancerDés
	public TroisDes lancerDes(){
		TroisDes tire = new TroisDes(super.get(), super.get(), super.get());
		return tire;

		}
		//catch and throw exception in method
	public void jeu421(TroisDes tire, String nom) throws E421 {
			
		int d1 = tire.getD1();
		int d2 = tire.getD2();
		int d3 = tire.getD3();
			
		ArrayList<Integer> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
			
		if (list.get(0) == 4) if (list.get(1) == 2)if (list.get(2)== 1) throw new E421(tire, nom);
		if (list.contains(4)) if (list.contains(2)) if (list.contains(1)) throw new E421(nom, tire);
	}

}

