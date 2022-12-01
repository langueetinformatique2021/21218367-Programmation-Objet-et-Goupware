package devoirTD8;

public class TestTroisDes {
	
	public static void Main (String[] args) throws E421 {
		LancerDes ld = new LancerDes("E421",4);
		TroisDes tire = ld.lancer();
		ld.showLanceur();
		tire.show();
			
}

}
