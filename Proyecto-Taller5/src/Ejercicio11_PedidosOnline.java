
import java.util.Scanner;

/***
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * @author David González
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costounitario, costototal, descuento;
        int cantidad;
        String descripcion;
        System.out.println("Dame un breve descripcion del producto: ");
        descripcion = teclado.nextLine();
        System.out.println("Dime la cantidad de productos: ");
        cantidad = teclado.nextInt();
        System.out.println("Dime el precio unitario del producto: ");
        costounitario = teclado.nextDouble();
        costototal = costounitario * cantidad;
        if (cantidad >= 50){
            descuento = costototal * 0.15;
            costototal = costototal - descuento;
            System.out.println("Descuento del 15%" + costototal);
        }
        System.out.println("Descripcion del producto: " + descripcion);
        System.out.println("Costo unitario: " + costounitario);
        System.out.println("Cantidad de producto: " + cantidad);
        System.out.println("Costo total del pedido: " + costototal);
    }
}
/***
 * Dame un breve descripcion del producto: 
 * Comida de perro
 * Dime la cantidad de productos: 
 * 60
 * Dime el precio unitario del producto: 
 * 10
 * Descuento del 15%510.0
 * Descripcion del producto: Comida de perro
 * Costo unitario: 10.0
 * Cantidad de producto: 60
 * Costo total del pedido: 510.0
 */