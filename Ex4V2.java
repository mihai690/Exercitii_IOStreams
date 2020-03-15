import java.util.*;
import java.io.*;
public class Ex4V2 {
    public static void main (String []args) {
        
        //citim din consola un nr "nr" intreg pozitiv 
        //si scriem intr un fisier x numere aleatoare in intervalul [0; 999]
        try (InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(in1))
        
         {
            System.out.print("NR:");
             int x = Integer.parseInt(br1.readLine());
             
             System.out.print("FILE:");
             String file = br1.readLine();
             
             Random r = new Random();
             
             try (PrintStream ps1 = new PrintStream(file)) {
                 for (int i = 0; i < x; i++) {
                ps1.println(r.nextInt(1000));
            }
                }
            
            
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}