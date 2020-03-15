import java.io.*;
public class Ex3 {
    public static void main (String []args) {
        //scriere intr un fisier - creat automat in locatia proiectului.
        
        //clasa care declara pe out din clasa System este PrintStream:
        try (PrintStream out = new PrintStream("hello.txt")) {
            out.println("HELLO WORLD!");
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}