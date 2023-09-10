
/**Encontrar los números entre el 1 y el 5000 que cumplen la regla de que la suma del cubo de sus 
dígitos es igual al número mismo. Ejemplo: 153 = 1 3 + 5 3   + 3 3  */

public class eje11 {
    public static void main(String[] args) 
    {  
        for (int i = 0; i < 5000; i++)
        {
            if(cumplenCubos(i))
            {
                System.out.println("el numero " + i + " cumple con la suma de cubos");
            }
        }

     }
     public static boolean cumplenCubos(int numero)
     {
        String numeroComoCadena = Integer.toString(numero);
        int longitud = numeroComoCadena.length();
        int sumacubos = 0, original = numero;
        for(int i = 0; i<=longitud-1; i++) 
        {  
            int parte = numero %10;
            sumacubos+= Math.pow(parte, 3);
            numero /=10;
        }
        return original == sumacubos;
     }   
}
