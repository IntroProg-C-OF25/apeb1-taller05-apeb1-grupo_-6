
import java.util.Scanner;

/***
 * Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 * @author Luis Quito
 */
public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        double preciokilovatioporhora, kilovatiosconsumidos, edad, valortotalplanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo del Kilovatio/Hora: ");
        preciokilovatioporhora = teclado.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        kilovatiosconsumidos = teclado.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextDouble();
        if (edad >= 65) {
            System.out.println("Usuario de la tercera edad, se descuenta el 10%");
        } else {
            System.out.println("No se descuenta");
        }
        if (edad >= 65) {
            valortotalplanilla = (preciokilovatioporhora * kilovatiosconsumidos) * 0.90;
        } else {
            valortotalplanilla = (preciokilovatioporhora * kilovatiosconsumidos);
        }
        System.out.println("Valor a cancelar de la planilla de luz es = " + valortotalplanilla);
    }
}
/***
 * run-single:
 * Ingrese el costo del Kilovatio/Hora: 0,23
 * Ingrese el numero de kilovatios consumidos en el mes: 196
 * Ingrese su edad: 68
 * Usuario de la tercera edad, se descuenta el 10%
 * Valor a cancelar de la planilla de luz es = 40.572
 */