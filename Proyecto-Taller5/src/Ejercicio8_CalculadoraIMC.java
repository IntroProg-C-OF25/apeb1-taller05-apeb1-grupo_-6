
import java.util.Scanner;

/***
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Luis Quito
 */
public class Ejercicio8_CalculadoraIMC {
    public static void main(String[] args) {
        double peso, altura, IMC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso(kg): ");
        peso = teclado.nextInt();
        System.out.println("Ingrese su altura(cm): ");
        altura = teclado.nextInt();
        IMC = (peso / (altura * altura));
        if(IMC <= 18.5){
            System.out.println("El usuario tiene un idice de masa corporal de bajo peso");
        }else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("El usuario tiene un idice de masa corporal de peso normal");
        }else if (IMC >=25 && IMC >= 29.9){
            System.out.println("El usuario tiene un idice de masa corporal de sobrepeso");
        }else if (IMC >= 30 && IMC <= 34.9){
            System.out.println("El usuario tiene un idice de masa corporal de obecidad tipo 1");
        }else if (IMC >= 35 && IMC <= 39.9){
            System.out.println("El usuario tiene un idice de masa corporal de obesidad tipo 2");
        }
    }
}
/***
 * run-single:
 * Ingrese su peso(kg):
 * 55
 * Ingrese su altura(cm):
 * 170
 * El usuario tiene un idice de masa corporal de bajo peso
 */
