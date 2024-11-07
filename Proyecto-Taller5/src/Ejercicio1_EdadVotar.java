
import java.util.Scanner;

/***
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author David González
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad ");
        edad = teclado.nextInt();
        if(edad >= 18)
            System.out.println("Si puede votar ");
        else
            System.out.println("No puede votar ");
    }
}
/***
 * run:
 * Dime tu edad 
 * 10
 * No puede votar 
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */
