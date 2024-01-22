package individuo;

/**
 *
 * @author David
 */

public class Fecha {
    private int dia;
    private int mes;
    private int a�o;
    
    //Constructor por defecto
    public Fecha(){}
    
    //Constructor con Parametros
    public Fecha(int dia, int mes, int a�o){
        //se pone this.dia porq el argumento tiene el mismo nombre que el de la variable
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }
    //Ejemplo->
    /*public Fecha(int diaM, int mesM, int a�oM) {
        //se pone this.dia porq el argumento tiene el mismo nombre que el de la variable
        dia = diaM  
        mes = mesM;
        a�o = a�oM;
    }*/
    
    //Metodos GET y SET
    public void setDia(int d){
        dia = d;
    }
    public void setMes(int m){
        mes = m;
    }
    public void setA�o(int a){
        a�o = a;
    }
    public int getDia(){
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getA�o() {
        return a�o;
    }
    
    //Metodo para comprobar si la FECHA es CORRECTA
    //No se usa el this. porque no hay argumentos con el mismo nombre de la variable
    public boolean fechaCorrecta(){
        //Declaramos diferentes booleans para comprobar el dia, mes y a�o
        boolean diaCorrecto, mesCorrecto, a�oCorrecto;
        //Decimos que se tiene que cumplir para que el dia, mes y a�o sean correctos
        a�oCorrecto = a�o > 0;
        mesCorrecto = mes<=12 && mes>= 1;
        switch(mes){ //Comprobamos los dias, segun el mes en el que estemos
            case 2: 
                if(esBisiesto()){
                    diaCorrecto = dia<=29 && dia>=1;
                }
                else{
                    diaCorrecto = dia<=28 && dia>=1;
                }
                break;
            case 4: 
            case 6: 
            case 9:
            case 11: 
                diaCorrecto= dia<=30 && dia>=1;
                break;
            default:
                diaCorrecto= dia<=31 && dia>=1;
        }//Fin switch
        return diaCorrecto && mesCorrecto && a�oCorrecto;        
    }//Fin metodo fechaCorrecta
    
    //Metodo comprobar si el a�o es bisiesto 
    //Lo usaremos en el metodo fechaCorrecta
    private boolean esBisiesto(){
        return(a�o%4 == 0 && a�o % 100!=0 || a�o % 400==0);
    }//Fin metodo esBisiesto
    
    //Metodo que modifica la fecha actual y la cambia por el dia siguiente
    public void diaSiguiente(){
        if(!fechaCorrecta()){ // exclamaci�n ! para poner lo contrario un not
            dia=1;
            mes++;
            if (!fechaCorrecta()){
                mes=1;
                a�o++;
            }//Fin if
        }
        else{
            dia++;
        }//Fin if-else
    }//fin metodo diaSiguiente
    
    //Metodo para MOSTRAR FECHA
    @Override
    public String toString(){
        StringBuilder fespa�ol = new StringBuilder(); //constructor String Aunque 
        //StringBuilder es un objeto din�mico que permite expandir el n�mero de caracteres de la cadena que encapsula,
        if(dia<10){
            fespa�ol.append("0"); //.append para a�adir
        }
        fespa�ol.append(dia);
        fespa�ol.append("-");
        if(mes<10){
            fespa�ol.append("0");
        }
        fespa�ol.append(mes);
        fespa�ol.append("-");
        fespa�ol.append(a�o);
        
        return fespa�ol.toString();
    }//Fin metodo
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Fecha nueva = new Fecha(this.dia,this.mes,this.a�o);
        return nueva;
    }
}
