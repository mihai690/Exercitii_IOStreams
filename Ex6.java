import java.io.*;
public class Ex6 {
    //SCRIEREA unei instante de obiect intr un fisier
    public static void main(String []args) {
        //fluxul low leve de iesire catre un fisier
        try (FileOutputStream fos = new FileOutputStream("pisica.txt");
        //fl high level fol pt a transfera instante de obiect
        ObjectOutputStream out = new ObjectOutputStream(fos)) {
            
            Pisica p = new Pisica("Tom", 3);
            out.writeObject(p); //reprezentare sub forma de bytes
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}