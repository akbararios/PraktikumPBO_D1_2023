/* 
* File : Poligon.java 
* Penulis : Akbar Ario Satrio Utomo
* Tanggal : 30 Maret 2023
* Deskripsi : Modul class untuk poligon 2 dimensi
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int jumlahSisi){
		this.jumlahSisi = jumlahSisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}