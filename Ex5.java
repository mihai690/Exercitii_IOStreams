import java.io.*;
public class Ex5 {
    public static void main (String []args) {
        //citeste nr dintr un fisier de la o adresa data in cons si afiseaza suma lor
        try (InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr1);
            ) {
                System.out.println("FILE:");
                String file = cons.readLine(); //citesc intai adresa fisierului
                
                try (
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(fis);
                BufferedReader in = new BufferedReader(reader)
                ) {
                    int suma = 0;
                    String line; //pt a citi fiecare linie
                    
                    while ((line = in.readLine() ) != null ) {
                        suma += Integer.parseInt(line);
                    }
                    System.out.println("SUMA: " + suma);
                
                }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}