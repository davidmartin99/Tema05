package banco;

/**
 *
 * @author david
 */

public class testCuenta {
         //A�adimos THROWS EXCEPTION 
         public static void main(String[] args) throws Exception {
                  CCuenta cuenta01 = new CCuenta();
                  CCuenta cuenta02 = new CCuenta("Sara Gonzalez", "ES5521000555555555555",900, 3);
                  
                  cuenta01.asignarNombre("Juan Gomez");
                  cuenta01.asignarCuenta("ES55210000333333333333");
                  cuenta01.asignarTipoInteres(3.5);
                  cuenta01.ingreso(3000);
                  
                  System.out.println("Cuenta01 saldo: "+cuenta01.estado());
                  System.out.println("Cuenta02 saldo: " + cuenta02.estado());

                  
                  //Comprobamos que salta la Excepcion
                  cuenta01.reintegro(2500);
                  System.out.println("Cuenta01 saldo: "+cuenta01.estado());
                  cuenta01.reintegro(2500);
                  System.out.println("Cuenta01 saldo: " + cuenta01.estado());
                  
         }
}
