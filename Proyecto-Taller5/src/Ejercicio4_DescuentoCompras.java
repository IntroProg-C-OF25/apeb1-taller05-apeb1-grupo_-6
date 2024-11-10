
import java.util.Scanner;

/***
 * Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; De lo contrario, no hay descuento.
 * @author Luis Quito
 */
public class Ejercicio4_DescuentoCompras {
    public static void main(String[] args) {
        double precioproducto, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el valor de producto: ");
        precioproducto = teclado.nextInt();
        if(precioproducto >= 100){ 
            descuento = (precioproducto * 0.90);
            System.out.println("Se descuenta el 10%");
            System.out.println("El valor total es: " + descuento);
        } else if (precioproducto < 100) { 
            System.out.println("No se descuenta");
            System.out.println("El valor total es: " + precioproducto);
        }
    }
}
/***
 * run-single:
 * Dame el valor de producto: 
 * 175
 * Se descuenta el 10%
 * El valor total es: 157.5
 */