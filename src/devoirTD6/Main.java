package devoirTD6;

import java.lang.reflect.Modifier;

public class Main {
	 public static void main(String[] args) {
		 // test pour crocodile
		 Crocodile crocodiletest = new Crocodile("crocodiles d'Egypte");
		 crocodiletest.présente();
		 System.out.print("\n*******\r");
		 Crocodile autrecrocodile = new Crocodile("crocodiles blancs");
		 autrecrocodile.présente();
		 System.out.print("\n*******\r");
		 
		 // reptile ne peut être instancié directement à cause de "abstract" => fonctionnement attendu
		 if(Modifier.isAbstract(Reptile.class.getModifiers()))
			 System.out.println("C'est bien le fonctionnement attendu.");
		 if(Modifier.isAbstract(Crocodile.class.getModifiers()))
			 System.out.println("Erreur.");
}
}
