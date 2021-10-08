
/**
 * Write a description of class principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class principal
{
    public static void main(String args[]){
        perro miPerro = new perro(1,"zorro",10.5f);
        miPerro.alimentar(0);
        miPerro.Interactuar();
        miPerro.imprimerInformacion();
        
       
        
        gato Mish = new gato(1,"Chucky",10.5f);
        Mish.alimentar(0);
        Mish.Interactuar();
        Mish.imprimerInformacion();
        
        
    }
}
