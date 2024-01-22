package individuo;

/**
 *
 * @author david
 */
public class DNI {
    //Atributos estaticos: todas las letras del DNI
    static final String LETRAS_DNI="TRWAGMYFPDXBNJZSQVHLCKE";//letras ordenadas T=1, R=2...
    //Atributos del objeto
    private int numDNI;
    
    //METODOS PUBLICOS
    
    //METODOS PRIVADOS
    private static char extraerLetraNIF(String nif){
        char letra = nif.charAt(nif.length()-1);
        return letra;
    }//Fin metodo extraerLetraNIF
    
    private static int extraerNumeroNIF(String nif){
        int numero = Integer.parseInt(nif.substring(0, nif.length()-1));
        return numero;
    }//Fin metodo extraerNumeroNIF
    
    private static char calcularLetraNIF(int numeroDNI){
        char letra;
        letra = LETRAS_DNI.charAt(numeroDNI%23);// Sacamos la posicion de la letra con .charAt 
        //y con numeroDNI%23 calculamos el resto para sacar la letra
        return letra;
    }//Fin metodo calcularLetraNIF
    
}//Fin class DNI
