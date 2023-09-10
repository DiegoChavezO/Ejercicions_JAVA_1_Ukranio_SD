/*
 *  
Lee la definición de números capicúa y escribe un programa que reciba un número entre 0 y 
9999 e indique si es un número capicúa. Nota, no es necesario utilizar ciclos, es posible realizarlo 
utilizando divisiones enteras. 
 */
import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int capi = validaR(myscan);
        
        int A,B,C,D;
        if(capi <=9 )
        {
            System.out.println("Es CAPICUA por definición");
        }else if(capi >=10 && capi <=99)
        {
            A = capi%10;
            B = capi /10;
            if(A == B)
            {
                System.out.println("ES CAPICUA");
            }
            else
            {
                System.out.println("No lo es");
            }
            //System.out.println(""+ A+ " SOY "+B);
        }
        else if(capi >=100 && capi <=999)
        {
            A = capi%10;
            B = capi /100;
            if(A == B)
            {
                System.out.println("ES CAPICUA");
            }
            else
            {
                System.out.println("No lo es");
            }
        
        }
        else if(capi >=1000 && capi <=9999)
        {
            A = capi %10;
            B = (capi / 10) % 10;
            C = (capi /100 ) % 10;
            D = (capi /1000 ) ;
            System.out.println(""+A +""+B+""+C+""+D);   
            if(A == D && B == C )
            {
                System.out.println("ES CAPICUA");
            }
            else
            {
                System.out.println("No lo es");
            }
        }

        
    }
    public static int validaR(Scanner nscan)
    {
        while(true){
            try {
            System.out.println("Ingrese SU NUMERO");
            int capi = nscan.nextInt();
            if(capi >0 && capi <=9999 ){
                System.out.println("PERCECTO");
                return capi;
            }
            else{
                System.out.println("Intente ptra vez");
            }
            }
            catch(Exception e){
                return -1;
            }
        }
    }

}
