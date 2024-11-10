
import java.util.Scanner;

/***
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author David González
 */

public class Ejercicio9_OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3 ;
        System.out.println("Dame el primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Dame el segundo número: ");
        n2 = teclado.nextInt();
        System.out.println("Dame el tercer número: ");
        n3 = teclado.nextInt();
        if((n3>n2)&&(n2>n1)){
            System.out.println("El orden númerico descendente: " + n3 + "," + n2 +  "," + n1);
        }else if ((n1 > n2) && (n2 > n3)){
            System.out.println("El orden númerico descendente: " + n1 + "," + n2 +  "," + n3);
        } else if((n2 > n1) && (n1 > n3)){
            System.out.println("El orden númerico descendente: " + n2 + "," + n1 +  "," + n3);
        } else if((n3 > n1) && (n1 > n2)){
            System.out.println("El orden númerico descendente: " + n3 + "," + n1 +  "," + n2);
        } else if ((n1 > n2) &&(n3 > n2)){
            System.out.println("El orden númerico descendente: " + n1 + "," + n3 +  "," + n2);
        } else if((n2 > n1) &&(n3 > n1)){
            System.out.println("El orden númerico descendente: " + n2 + "," + n3 +  "," + n1);
        } else if ((n3 > n1)&&(n2 > n1)){
            System.out.println("El orden númerico descendente: " + n3 + "," + n2 +  "," + n1);
        } else if ((n3 > n2)&&(n2>n1)){
            System.out.println("El orden númerico descendente: " + n3 + "," + n2 +  "," + n1);
        }
    }
}
/***
 * Dame el primer número: 
 * 30
 * Dame el segundo número: 
 * 20
 * Dame el tercer número: 
 * 10
 * El orden númerico descendente: 30,20,10
 */