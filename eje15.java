/*
 * En este programa la computadora debe elegir un número al azar entre 1 y 100 y solicitará al 
usuario que “adivine” el número. A cada intento del usuario la computadora debe indicar si el número 
que el usuario introdujo es mayor o menor que el número prefijado. El programa debe terminar cuando 
el usuario “adivine” el número o introduzca el número “0” para salir. 
 */
import java.util.Scanner;
public class eje15 {
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        System.out.println("Bienvenido, intente adivinar el numero que la máquina le asigna: Precione 0 para salir");
        int numero = (int)(Math.random()*100+1);
        System.out.println(numero+" no existo, solo estoy aqui para debuggear y saber que soy el numero aleatorio...");
        boolean res = atinaste(numero,MyScan);
        if(res == true) {
            System.out.println("Felicidades, el numero es: "+numero);
        }else{
            System.out.println("Saliendo...");
        }
        
    }
    public static boolean atinaste(int numero, Scanner scan)
    {   
        while(true)
        {
            System.out.print("ingrese el número: ");
            int entrada = scan.nextInt();
            if(entrada == 0)
            {
                return false;
            }else if (entrada == numero)
            {
                return true;
            }
            
        }
    }

}
