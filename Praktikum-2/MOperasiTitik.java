 /**
 * File : MOperasiTitik.java 7/03/23
 * Penulis : Akbar Ario Satrio Utomo
 * Deskripsi : kelas yang berisi program untuk menjalankan operasi pada titik
 * 			
 */ 

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t  = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiX(t); // hasil
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiY(t); // hasil
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
	}
	
}
