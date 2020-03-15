public class Pisica implements java.io.Serializable {
    public static final long serialVersionUID = 1;
    
    //serialVersionUID reprez versiunea obiectului
    
    String nume;
    int varsta;
    String culoare; // desi am adaugat un atribut,nu am modificat versiunea-se ignora cul
    
    //transient int varsta; - valoarea nu se transmite prin flux
    //daca vrem ca un atribut sa nu fie serializat
    //de ex, nu dorim ca parolele sa fie puse pe un flux
    
    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}
