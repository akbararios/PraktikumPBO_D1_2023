package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(12,8,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang: "+persegi.hitungLuas());
	}
	
}