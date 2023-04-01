/* 
* File : Poligon.java 
* Penulis : Akbar Ario Satrio Utomo
* Tanggal : 30 Maret 2023
* Deskripsi : Main class untuk bujur sangkar 
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}