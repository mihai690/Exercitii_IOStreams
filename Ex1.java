import java.io.*;
public class Ex1 {
    public static void main (String []args) {
        //citim un sir de caractere si il afisam inversat
        try (
        InputStreamReader in = new InputStreamReader(System.in);
        //primeste ca si parametru fluxul low level
        BufferedReader cons = new BufferedReader(in); 
        )
        //flux mai special - primeste ca si parametru o instanta de Reader
        //ii spune lui BR care e logica de citire - Input/FileStreamReader
        
        {
        String line = cons.readLine();
        //propaga de IOException
        
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();
        
        System.out.println(sb);
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }
}