import java.io.*;
public class Ex2 {
    public static void main (String []args) {
        //citire din fisier cu BufferedReader
        try (FileInputStream fis = new FileInputStream("Ex2.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader in = new BufferedReader(isr)) {
            
            String line;
            
            while ( (line = in.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}