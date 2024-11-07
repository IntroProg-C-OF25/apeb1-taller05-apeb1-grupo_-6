
import java.util.Scanner;

/***
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. 
 * Si son iguales, mostrar un mensaje.
 * @author David González
 */
public class Ejercicio3_Mayor3Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Dame el valor del primer número ");
        n1 = teclado.nextDouble();
        System.out.println("Dame el valor del segundo número ");
        n2 = teclado.nextDouble();
        System.out.println("Dame el valor del tercer número ");
        n3 = teclado.nextDouble();
        if (n1>n2 && n1>n3){
            System.out.println("El número de mayor valor es: " + n1 );
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número de mayor valor es: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El número de mayor valor es: "+ n3 );
        } else if (n1 == n2 && n2 == n3){
            System.out.println("Los tres números son iguales ");
        }  
    }
}
