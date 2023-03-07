/**
 * File : Titik.java 28/02/23
 * Penulis : Akbar Ario Satrio Utomo
 * Deskripsi : kelas yang berisi program untuk membuat data koordinat Titik dan menampilkannya ke layar
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
	
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}

 }
 
 
 
