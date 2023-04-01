package org.main;

import org.bangundatar.Segitiga;

public class MSegitiga{
	public static void main(String[] args){
		Segitiga Segitiga = new Segitiga(3,4,3);
		System.out.println("Panjang sisi miring segitiga : "+Segitiga.getSisiMiring());
		System.out.println("Luas Segitiga : "+Segitiga.hitungLuas());
	}
}