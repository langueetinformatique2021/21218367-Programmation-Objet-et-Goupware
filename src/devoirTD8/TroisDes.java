package devoirTD8;

import java.util.ArrayList;

public class TroisDes {
	private int d1,d2,d3;
	
	public TroisDes(int d1, int d2, int d3) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	public void show() {
		System.out.println("Premier valeur: "+this.d1);
		System.out.println("Deuxième valeur: "+this.d2);
		System.out.println("Troisième valeur: "+this.d3);
	}
	
	

	public int d1() {
		return this.d1;
	}
	
	public int d2() {
		return this.d2;
	}
	public int d3() {
		return this.d3;
	}
	public String toString() {
		return "\nPremier valeur: "+this.d1 + "\nDeuxième valeur: "+this.d2 + "\nTroisième valeur: "+this.d3;
	}