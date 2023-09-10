/*
 * Leer 10 números enteros, guardarlos en orden inverso al que fueron introducidos y mostrarlos 
    en pantalla. 
 */
import java.util.Scanner;
public class eje17 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scan = new Scanner(System.in);


        for(int i=9 ;i>=0;i--)
        {
            System.out.print("ingrese el elemento "+ (10-i ) + ":");
            int x = scan.nextInt();
            numeros[i] = x;    
        }
        System.out.println("Los numeros en orden inverso son: ");
        for(int i=0 ;i<10;i++)
        {
            System.out.print(" "+numeros[i]);   
        }
    }
}
