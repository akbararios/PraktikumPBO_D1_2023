/**
 * File      	: BangunDatarGeneric.java 06/06/23
 * Penulis 		: Akbar Ario Satrio Utomo
 * Deskripsi 	: kelas konstruksi generic untuk bangun datar
 *                
 */

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	/*mengganti T menjadi T1 dapat memberi nama parameter generic deskriptif sehingga 
	*saat menggunakan parameter generik lebih dari 1 di kelas tersebut dapat dibedakan.
	*/
}

