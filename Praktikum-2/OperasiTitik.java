 /**
 * File : OperasiTitik.java 7/03/23
 * Penulis : Akbar Ario Satrio Utomo
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas Titik.
 * 
 */ 
 
 public class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double x;
		x = titik.getAbsis();
		x = x*-1;
		titik.setAbsis(x);
	}
	private void refleksiSumbuY(Titik titik){
		double y;
		y = titik.getOrdinat();
		y = y*-1;
		titik.setOrdinat(y);
	}
	public void refleksiX(Titik titik){
		refleksiSumbuX(titik);
	}
	public void refleksiY(Titik titik){
		refleksiSumbuY(titik);
	}
 }