/**
* File : SerializePerson.java 09/06/2023
* Nama : Akbar Ario Satrio Utomo
* Deskripsi : Program untuk serialisasi objek person
*/
import java.io.*;
//class Person
class Person implements Serializable{
    private String name;
        public Person(String n){
            name = n;
        }
        public String getName(){
            return name;
        }
        }
        //class SerializePerson
        public class SerializePerson{
        public static void main(String[] args){
        Person person = new Person("Akbar Ario");
        try{
            FileOutputStream f= new
            FileOutputStream("person.ser");
            ObjectOutputStream s = new
            ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
