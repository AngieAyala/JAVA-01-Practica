
/**
 * Write a description of class gato here.
 * 
 * @author (Angie) 
 * @version (1.0)
 */
public class gato
{
    // instance variables - replace the example below with your own
    private int edad=0;
    private String nombre="gato" ;
    private float peso=1.0f;
    /**
     * Constructor for objects of class gato
     */
    public int edadHumana(){
        return edad*7;
    
    }
public String Interactuar(){
    return "Guau";
    
}
public void imprimerInformacion(){
    System.out.println("Es un gato comiendo carne"+edad+"años, y me llamo:"+nombre);
}
gato (int pEdad, String pNombre, float pPeso){
    edad = pEdad;
    nombre = pNombre;
    peso = pPeso;
}
public void alimentar(int tipoDeComida){
    if (tipoDeComida==0)
    System.out.println("Es un gato comiendo carne");
    else
    System.out.println("Es un gato comiendo croquetas");
}
}
