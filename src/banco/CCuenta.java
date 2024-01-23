package banco;

/**
 *
 * @author david
 */
public class CCuenta {
         //Atributos
         private String nombre;
         private String cuenta;
         private double saldo;
         private double tipoDeInteres;
         
         //Constructores
         public CCuenta(){}

         public CCuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
                  asignarNombre(nombre);
                  asignarCuenta(cuenta);
                  ingreso(saldo);
                  asignarTipoInteres(tipo);
         }//Fin Constructor
         
         //Metodos propios 
         public void asignarNombre(String nombre){
                  this.nombre = nombre;
         }
         public String obtenerNombre(){
                  return nombre;
         }

         public void asignarCuenta(String cuenta) {
                  this.cuenta = cuenta;
         }
         public String obtenerCuenta() {
                  return cuenta;
         }
         
         public double estado(){
                  return saldo;
         }
         
         public void ingreso(double cantidad){
                  saldo += cantidad;
         }
         public void reintegro(double cantidad){
                  saldo -= cantidad;
         }
         
         public void asignarTipoInteres(double tipo){
                  this.tipoDeInteres = tipo;
         }
         
         public double obtenerTipoInteres(){
                  return tipoDeInteres;
         }
         
}
