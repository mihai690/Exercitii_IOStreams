import java.util.*;
import java.io.*;
public class Ex4 {
    public static void main (String []args) {
        Random r = new Random();
        //citim din consola un nr x intreg pozitiv 
        //si scriem intr un fisier x numere aleatoare in intervalul [0; 999]
        try (InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(in1);
        PrintStream ps1 = new PrintStream("numere.txt");) {
            int x = Integer.parseInt(br1.readLine());
            
            for (int i = 0; i < x; i++) {
                ps1.println(r.nextInt(1000));
            }
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}