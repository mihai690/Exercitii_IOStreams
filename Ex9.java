import java.io.*;
public class Ex9 {
    //citim din fisier pe C
    public static void main (String []args) {
    try (
        FileInputStream fis = new FileInputStream("C");
        ObjectInputStream in = new ObjectInputStream(fis);
        
    
    ) {
        C c = (C) in.readObject(); 
        // se apeleaza numai constructorul clasei neserializabile
        //deci se va afisa A
        
        
        
    } catch (IOException | ClassNotFoundException e) {
    //nu treb sa fie nici o relatie intre cele 2 exceptii pt a le putea pune impreuna {
        e.printStackTrace(); }
    }
    }

    
