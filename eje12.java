/*
 * Un número perfecto es un número natural que es igual a la suma de sus divisores propios, sin 
incluirse él mismo. Por ejemplo, el número 6 es perfecto porque sus divisores son 1, 2 y 3; y dado que 
1+2+3 = 6 entonces el 6 es un número perfecto. Escriba un programa que indique los números perfectos 
existentes entre 1 y 10,000.
 */
public class eje12 {
    public static void main(String[] args) {
        for(int i=1; i<=10000;i++)
        {
            if(esperfecto(i))
            {
                System.out.println("el numero "+i+" es perfecto");
            }
        }
    }
    public static boolean esperfecto(int num)
    {   
        int res = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i == 0)
            {
                res = res +i;
            }
        }
        return res == num;
    }
    
}
