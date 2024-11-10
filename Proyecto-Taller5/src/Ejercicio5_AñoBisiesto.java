
import java.util.Scanner;

/***
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author David González
 */
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int periodo; 
        boolean resultado; 
        System.out.println("Escribe al año a verificar: ");
        periodo = teclado.nextInt();
        resultado = (periodo % 4 == 0 && periodo % 100 != 0 || periodo % 400 == 0  ); 
       if (resultado == true ){
           System.out.println( "El año " + periodo + " es bisiesto. " );
       } else if (resultado == false){
           System.out.println("El año " + periodo + " no es bisiesto. ");
       }
    }
}
/***
 * run:
 * Escribe al año a verificar: 
 * 2019
 * El año 2019 no es bisiesto. 
 * 
 */