
import java.util.Scanner;

/***
 * Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Luis Quito
 */
public class Ejercicio2_DiaSemana {
    public static void main(String[] args) {
        //Estructura de control de seleccion multiple 
        //EN CASO DE <=> SWITCH
        int numDia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el número de dia: ");
        numDia = teclado.nextInt();
        switch(numDia)
        {
            case 1: System.out.println("LUNES"); 
                    break;
            case 2: System.out.println("MARTES");
                    break;
            case 3: System.out.println("MIERCOLES");
                    break;
            case 4: System.out.println("JUEVES"); 
                    break;
            case 5: System.out.println("VIERNES");
                    break;
            case 6: System.out.println("SABADO");
                    break;
            case 7: System.out.println("DOMINGO");
                    break;
            default: System.out.println("Error de número ");
        }
    }
}
/***
 * run-single:
 * Dime el número de dia: 
 * 5
 * VIERNES
 */
