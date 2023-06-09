/**
* File : PersonDAO.java 09/06/2023
* Nama : Akbar Ario Satrio Utomo
* Deskripsi : main data access object
*/
public class MainDAO{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}    