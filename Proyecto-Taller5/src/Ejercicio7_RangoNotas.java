
import java.util.Scanner;

/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author David González
 */

public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calificacion;
        System.out.println("Dime la calificación: ");
        calificacion = teclado.nextDouble();
        if (calificacion <= 100 && calificacion >= 90){
            System.out.println("Tu calificación es A");
        } else if(calificacion <= 89 && calificacion >= 80) {
            System.out.println("Tu calificacion es B");
        } else if(calificacion <= 79 && calificacion >= 60){
            System.out.println("Tu calificacion es C");
        } else if(calificacion <= 59 && calificacion >= 50){
            System.out.println("Tu calificacion es D");
        } else  {
            System.out.println("Anda estudia ");
        }
    }
}

/***
 * run:
 * Dime la calificación: 
 * 86
 * Tu calificacion es B
 */