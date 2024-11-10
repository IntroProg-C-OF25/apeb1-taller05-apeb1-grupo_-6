
import java.util.Scanner;

/**
 * Sistema de reservas hoteleras: 
 * En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar un solución que pida como datos de entrada el número de días y 
 * el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author David González
 */
public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costod, subpago,descuento, total;
        int dias;
        System.out.println("Dime el costo diario de la habitación: ");
        costod = teclado.nextDouble();
        System.out.println("Dime los dias que te vas a hospedar: ");
        dias = teclado.nextInt();
        subpago = costod * dias;
        descuento = 0;
        total = 0; 
        if (costod <= 0||dias <= 0){
            System.out.println("El costo diario y los días deben ser mayores que cero.");
        } else if (dias > 5 && dias < 10 ){
            descuento = (subpago * 0.10);
            total = (subpago - descuento);
        } else if (dias > 10 && dias < 15 ){
            descuento = (subpago * 0.15);
            total = (subpago - descuento);
        } else if (dias > 15){
            descuento = (subpago * 0.25);
            total = (subpago - descuento);
        }
        System.out.println("Subtotal: " + subpago);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}
/***
 * Dime el costo diario de la habitación: 
 * 30
 * Dime los dias que te vas a hospedar: 
 * 18
 * Subtotal: 540.0
 * Descuento: 135.0
 * Total a pagar: 405.0
 */