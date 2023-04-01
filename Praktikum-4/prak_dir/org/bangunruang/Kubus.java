/* 
* File : Poligon.java 
* Penulis : Akbar Ario Satrio Utomo
* Tanggal : 30 Maret 2023
* Deskripsi : Modul class kubus, turunan kelas bangun datar bujur sangkar
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
}



