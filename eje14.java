/*
 * Escribe un programa que lea un número X y un número Y. Mostrar los números de Y en Y, 
comenzando en X hasta llegar a 200. Ejmplo: X = 8, Y = 2, el resultado comenzaría de la siguiente 
manera: 8, 10, 12, 14, 16, 18 …
 */
import java.util.Scanner;
public class eje14 {
    public static void main(String[] args) {
        try (Scanner myScan = new Scanner(System.in)) {
            System.out.print("ingrese un numero X: ");
            int X = myScan.nextInt();
            System.out.print("ingrese otro numero Y: ");
            int Y = myScan.nextInt();
            
            do{
                System.out.println(X);
                X += Y; 
            }
            while(X <= 200);
            
        }
    }
}
