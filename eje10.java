/*scribe un programa que solicite al usuario un número entero y dé como resultado la suma de 
todos los números desde el 1 hasta dicho numero.  */
import java.util.Scanner;
public class eje10 {
 public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i<=num; i++) 
        {  
            sum =sum+i;
        }
         System.out.println(""+sum);
    }
    catch (Exception e) {
       
        System.out.println("error,vuelva a ejecutar");
    }
 }   
}
