/* Escriba un programa que solicite los valores de a, b, c y d (como números enteros) y calcule el valor de la 
multiplicación y lo muestre en pantalla en forma de número con decimales y en forma de fracción 
(ejemplo 17/33).
 */
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] fractions = {0,0,0,0};
        for (int i=0; i<4; i++)
        {
            
            System.out.println("Ingrese el número "+ i + " : ");
            fractions[i] = myObj.nextInt();
        }
        
        /*Multiplicacion de fracciones */
        fractions[0] = fractions[0] * fractions[2];
        fractions[1] = fractions[1] * fractions[3];

        System.out.println("El valor en fraccion es: "+ fractions[0] +"/"+fractions[1]);
    }
}
