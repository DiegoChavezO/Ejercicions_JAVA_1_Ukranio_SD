import java.util.Scanner;

public class eje6 {
    
    // EJERCICIO 6
    /**
     * Calcular el cobro que una caseta de cuota debe realizar a un vehículo de acuerdo con las 
        siguientes reglas: Motocicleta = $20, 2 ejes(automóviles) = $40, 3 ejes (camionetas) = $60, 4, 5 y 6 ejes 
        (camiones de carga) = $250, eje adicional $50. Por ejemplo si llega un trailer de 8 ejes se deben cobrar 
        $350.
     * 
     */
    //funciones del ejercicio 6 
    public static int validarOpciones(Scanner scaner )
    {
        
        while(true) 
        {
            System.out.println("Ingrese el tipo de ejes de su vehiculo (Motos 1 eje, autos2, camiones 3 o mas son de carga): ");
            int vehiculo = scaner.nextInt();
            if (vehiculo >0 && vehiculo <15)
            {
                System.out.println("los "+vehiculo+" ejes son correctos ");
                return vehiculo;
            }
            else
            {
                System.out.println("no hay camiones con "+vehiculo+" ejes ");
            }

        }
    }
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        int cuota, ejes;
        ejes = validarOpciones(MyScan);
        if(ejes == 1)
        {
            cuota = 20;
            System.out.println("Debes pagar "+cuota +"$");
        }
        else if(ejes == 2)
        {
            cuota = 40;
            System.out.println("Debes pagar "+cuota +"$");
        }
        else if(ejes == 3)
        {
            cuota = 60;
            System.out.println("Debes pagar "+cuota +"$");
        }
        else if(ejes >= 4 && ejes <= 6)
        {
            cuota = 250;
            System.out.println("Debes pagar "+cuota +"$");
        }
        else{
            cuota = 250 + ((ejes-6) * 50);
            System.out.println("Debes pagar "+cuota +"$");
        }
    }
}
