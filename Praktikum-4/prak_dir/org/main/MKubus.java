/* 
* File : Poligon.java 
* Penulis : Akbar Ario Satrio Utomo
* Tanggal : 30 Maret 2023
* Deskripsi : Main class kubus, turunan kelas bangun datar bujur sangkar
*/

package org.main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
	}
}