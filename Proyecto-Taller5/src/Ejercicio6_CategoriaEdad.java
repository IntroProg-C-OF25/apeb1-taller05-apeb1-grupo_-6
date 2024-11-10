
import java.util.Scanner;

/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 * @author Luis Quito
 */
public class Ejercicio6_CategoriaEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Dame la edad: ");
        edad = teclado.nextInt();
        if(edad >=0 && edad <= 12){
            System.out.println("El usuario es Niño");
        } else if (edad >= 13 && edad <= 17){
            System.out.println("El usuario es Adolescente");
        }else if (edad<=100 && edad >= 18){
            System.out.println("El usuario es Adulto");
        } else {
            System.out.println("Valor no determinado");
        }
    }
}
/***
 * run-single:
 * Dame la edad: 
 * 13
 * El usuario es Adolescente
 */