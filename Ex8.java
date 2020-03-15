import java.io.*;
public class Ex8 {
    //scriem o instanta de C in fisier
    public static void main (String []args) {
        try (
            FileOutputStream fos = new FileOutputStream("C");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
            C c = new C();
            out.writeObject (c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}