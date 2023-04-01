/* 
* File : Segitiga.java 
* Penulis : Akbar Ario Satrio Utomo
* Tanggal : 21 Maret 2023
* Deskripsi : Representasi dari objek segitiga, turunan kelas poligon
*/

package org.bangundatar; 

import org.poligon.Poligon;
 
public class Segitiga extends Poligon{ 
    private double alas, tinggi, sisiMiring; 
 
    public Segitiga(double alas, double tinggi, int jumlahSisi){ 
        this.alas = alas; 
        this.tinggi = tinggi; 
        this.sisiMiring = 0; 
        this.jumlahSisi = jumlahSisi; 
    } 
 
    public double getSisiMiring(){ 
        sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi); 
        return sisiMiring; 
    } 

    public double hitungLuas(){  
        return 0.5 * alas * tinggi; 
    } 
 
    /*public void printInfo(){ 
        System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi()); 
    } */
}