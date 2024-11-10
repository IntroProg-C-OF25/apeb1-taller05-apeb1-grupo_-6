
import java.util.Scanner;

/***
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%      
 * @author Luis Quito
 */
public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        double costo, montoimpuesto, precioventa, impuesto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la marca de su automovil: ");
        String marca = teclado.nextLine();
        System.out.println("Ingrese el pais de origen del automovil (Alemania, Japon, Italia, Usa): ");
        String paisorigen = teclado.nextLine();
        System.out.println("Ingrese el costo del automovil: ");
        costo = teclado.nextDouble();
        switch (paisorigen) {
            case "Alemania":
                impuesto = 0.20;
                break;
            case "Japon":
                impuesto = 0.30;
                break;
            case "Italia":
                impuesto = 0.15;
                break;
            case "USA":
                impuesto = 0.08;
                break;
            default:
                System.out.println("Origen no valido");
                return;

        }
        montoimpuesto = (costo * impuesto);
        precioventa = costo + montoimpuesto;
        System.out.println("\n Detalles del Automóvil ");
        System.out.println("Marca: " + marca);
        System.out.println("Origen: " + paisorigen);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto a pagar: $" + montoimpuesto);
        System.out.println("Precio de venta (incluido el impuesto): $" + precioventa);
    }
}
/***
 * run-single:
 * Ingrese la marca de su automovil: 
 * TOYOTA
 * Ingrese el pais de origen del automovil (Alemania, Japon, Italia, Usa): 
 * Japon
 * Ingrese el costo del automovil: 
 * 15000

 * Detalles del Automóvil 
 * Marca: TOYOTA
 * Origen: Japon
 * Costo: $15000.0
 * Impuesto a pagar: $4500.0
 * Precio de venta (incluido el impuesto): $19500.0
 */