import java.io.*;
public class Ex7 {
    //CITIREA unei instante de obiect intr un fisier
    public static void main(String []args) {
        
        try (
            FileInputStream fis = new FileInputStream("pisica.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            Pisica p = (Pisica)in.readObject();
            System.out.println(p.nume + " " + p.varsta);
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        
         
         
        
    }
}