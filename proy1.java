/**
 * proy1: 1__Escribir un programa que reciba una cantidad en grados centígrados e indique a cuánto 
equivalen en grados Fahrenheit.

 */
import java.util.Scanner;
public class proy1 {

public static void main(String[] args) {
    Scanner gradesObj = new Scanner(System.in);
    System.out.println("Ingrese una cantidad en grados centigrados: ");
    int entradaCentigrados = gradesObj.nextInt();
    
    System.out.println("la entrada es: "+ entradaCentigrados + " en grados centigrados ");
    float Farenheit = ((float)entradaCentigrados * 9/5) + 32;
    
    System.out.println("los "+ entradaCentigrados + " grados centigrados son: "+ Farenheit + " grados Farenheit");
}
    
}
/* String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false */

