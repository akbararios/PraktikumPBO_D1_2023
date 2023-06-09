 /**
 * Nama File : LambdaHashMap.java 09/06/2023
 * Nama : Akbar Ario Satrio Utomo
 * Deskripsi : Program pengimplementasi lambda pada hash map
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060121140123", "Akbar Ario Satrio Utomo");
        mahasiswa.put("24060121130055", "Faris Naufal Izzatur Rahman");

        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}