/*El programa debe leer números mientras sean diferentes de 0. Posteriormente calcular el 
promedio de los números leídos. 
 */
import java.util.Scanner;
public class eje16 {
    public static void main(String[] args) {
        try (Scanner MyScan = new Scanner(System.in)) {
            System.out.println("Ingrese numeros para calcular su promedio, cuando ya no quiera más, elija 0");
            int numero = 0,elementos = 0;
            while(true)
            {
                System.out.print("Ingrese un número: ");
                int entrada = MyScan.nextInt();
                if(entrada == 0)
                {
                    break;
                }else
                {
                    numero += entrada;
                    elementos++;
                }
            }
            float promedio = numero/elementos;
            System.out.println(promedio);
        }
        

        
        
    }
}
