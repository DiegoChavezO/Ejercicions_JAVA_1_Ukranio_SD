/* 
 * scribe un programa que pida tres números y que los muestre ordenados de mayor a menor. 
    Nota: Este ejercicio no requiere ciclos ni ordenamientos especiales, puede realizarse utilizando “IF”. 
 * 
 */
import java.util.Scanner;
public class eje8 {
    public static void main(String[] args) {
        try (Scanner myscan = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            int A = myscan.nextInt();
            System.out.println("Ingrese el SEGUNDO número: ");
            int B = myscan.nextInt();
            System.out.println("Ingrese el TERCERO número: "); 
            int C = myscan.nextInt();
            if(A>B)
            {
                if(B>C)
                {
                    System.out.println(" "+C + " "+ B +" " + A);
                }
                else if(A<C)
                {
                    System.out.println(" "+B + " "+ A +" " + C);
                }
                else{
                    System.out.println(" "+B + " "+ C +" " + A);
                }
                
            }
            else
            {
                if(A>C)
                {
                    System.out.println(" "+C + " "+ A +" " + B);
                }
                else if(B<C)
                {
                    System.out.println(" "+A + " "+ B +" " + C);
                }
                else
                {
                    System.out.println(" "+A + " "+ C +" " + B);
                }
                
            }
        }
        
            
    }


    /* 
    public static int validarNumeros(Scanner scanner) {
        try{
            while(true)
            {
                System.out.println("Introduce un numero: ");
                int num = scanner.nextInt();
                if(num == )
                {

                }
            }
        }
        catch(Exception e)
        {
            return 0;
        }
        

    }   
    */ 
}
