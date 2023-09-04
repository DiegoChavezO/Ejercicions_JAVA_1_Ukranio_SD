/* Una universidad comenzará a asignar a sus estudiantes a diferentes dormitorios según su sexo y 
edad. Escribe un programa que solicite el sexo (H/M) y edad e indique de acuerdo con la siguiente tabla 
en qué edificio deben ser asignados. Validar que el sexo y edad sean valores correctos.
Hombre, 18 años = Edificio A
Mujer, 18 años = Edificio B
Hombre, 19 a 22 años = Edificio C
Mujer, 19 a 22 años = Edificio D
Hombre, Mayor de 22 años = Edificio E1
Mujer, Mayor de 22 años = Edificio E2 */
import java.util.Scanner;
public class eje4 
{
    
    //FUNCIONES DEL EJERCICIO 4
    public static String validarSexo(Scanner scanner)
    {   
        while(true)
        {
            System.out.println("Ingrese su sexo: " );
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("H"))
            {
                System.out.println("gracias, los datos son correctos");
                return sexo;
            }
            else if(sexo.equals("M"))
            {
                System.out.println("gracias, los datos son correctos");
                return sexo;
            }
            else
            {
                System.out.println(sexo +" es incorrecto, intentelo otra vez ");
            }
        }

    }
    public static int validarEdad(Scanner scann)
    {
        
        while(true)
        {
            System.out.println("Ingrese su edad: " );
            int edad = scann.nextInt(); 
            if(edad <0)
            {
                System.out.println("Error Fatal");
            } 
            
            else if(edad > 0 && edad <=17)
            {
                System.out.println("Error"+ edad +" esta mal. Intente otra vez");
            } 
            else if(edad >= 18 && edad <=30)
            {
                System.out.println("Su edad: "+ edad + " es correcta");
                return edad;
            }
            else{
                System.out.println("error");
            }
        }
        
    }
    
    //EJERCICIO 4
    public static void ejercicio4(){
        Scanner myScanner = new Scanner(System.in);
        String sexo = validarSexo(myScanner);
       
        int edad = validarEdad(myScanner);
        

        if(edad == 18)
        {
            if(sexo.equals("H"))
            {
                System.out.println("Su Edificio es el A");
            }
            else if( sexo.equals("M")){
                System.out.println("Su Edificio es el B");
            }
            else
            {
                System.out.println("Error");
            }
        }   
        else if(edad >= 19 && edad <= 22)
        {
            if( sexo.equals("H")){
                System.out.println("Su edificio es el C");
            }
            if( sexo.equals("M")){
                System.out.println("Su edificio es el D");
            }
        }
        else if(edad >= 23)
        {
            if( sexo.equals("H")){
                System.out.println("Su edificio es el E1");
            }
            if( sexo.equals("M")){
                System.out.println("Su edificio es el E2");
            }
        }
        
    }
    
    //EJERCICIO 5
    /*
     * Escribir un programa que indique cuántos días de vacaciones le corresponden a un empleado 
        considerando los años que ha trabajado en la empresa. Entre 1 y 5 años corresponden 5 días de 
        vacaciones, entre 6 y 10 años deben ser 10 días de vacaciones, de allí en adelante, es un día de 
        vacaciones extra por cada año de trabajo (a partir de 10), a partir de 20 años de trabajo se añaden 2 días 
        de vacaciones por cada año hasta un máximo de 45 días.
     */
    public static void ejercicio5()
    {
        
        Scanner myscan = new Scanner(System.in);
        int añosTrabajando = validarAños(myscan);
        int diasDeTrabajo = 0;
        if(añosTrabajando >= 1 && añosTrabajando <= 5)
        {   
            diasDeTrabajo = 5;
            System.out.println("Le corresponden" + diasDeTrabajo +"días de vacaciones");
        }

        else if(añosTrabajando >=6 && añosTrabajando <=10)
        {
            diasDeTrabajo = 10;
            System.out.println("Le corresponden" + diasDeTrabajo +"días de vacaciones");
        }
        else if (añosTrabajando >=11 && añosTrabajando <=20)
        {
            diasDeTrabajo =  añosTrabajando;
            System.out.println("Le corresponden" + diasDeTrabajo +"días de vacaciones");
        }
        else if (añosTrabajando >=21 && añosTrabajando <=32)
        {
            diasDeTrabajo =  2 * (añosTrabajando - 20) + 20;
            System.out.println("Le corresponden " + diasDeTrabajo +" días de vacaciones");
        }
        else
        {
            diasDeTrabajo =  45;
            System.out.println("Le corresponden " + diasDeTrabajo +" días de vacaciones");
        }

    }
    // funciones ejercicio 5
    public static int validarAños(Scanner scanner)
    {
        while(true)
        {
            System.out.println("Ingrese los años que ha trabajado: ");
            int añosTrabajando = scanner.nextInt();
            if (añosTrabajando<=0)
            {
                System.out.println("Error, no puedes trabajar menos o igual de 0 años");
            }
            else if(añosTrabajando >= 1 && añosTrabajando <= 80)
            {
                System.out.println("Correcto "+ añosTrabajando);
                return añosTrabajando;
            }
            else 
            {
                System.out.println("Error");
            }
        }
    }


 public static void main(String[] args) {
    //ejercicio4();
    ejercicio5();
}   

}
