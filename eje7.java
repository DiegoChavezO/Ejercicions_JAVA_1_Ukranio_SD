import java.util.Scanner;
public class eje7 {
    /*
     * La Comisión Federal de Electricidad cobra el consumo de electricidad de acuerdo con un 
        tabulador basado en los kilowatts consumidos en el periodo. La tabla es la siguiente:
        Costo del kW para Hogares:
        De 0 a 250 kW el costo por kW es de $0.65
        De 251 a 500 kW el costo por kW es de $0.85
        De 501 a 1200 kW el costo por kW es de $1.50
        De 1201 a 2100 kW el costo por kW es de $2.50
        De 2101 kW hacia arriba el costo por kW es de $3.00
        Costo del kW para Negocios: 
        $5.00, el costo es fijo por kilowatt sin importar la cantidad consumida.
        Ejemplo:
        a) Si en el hogar se consumen 737 kW durante el periodo entonces el total a pagar es de:
        250*0.65 + 250*0,85 + 237* 1.50 = 162.50 + 212.50 + 355.50 = $730.50
        b) Si en un negocio se consumen 250 kW, el valor a pagar serían de: 250* 5 = $1,250
        Escribe un programa que pregunte la cantidad de kW consumidos, si el cliente tiene un contrato de 
        Hogar o de Negocio y dé como resultado la cantidad a pagar
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String negocio = validarNegocio(myScan);
        int kwatts = validarWats(myScan);
        //String negocio = validarNegocio(myScan);
        //float[] constantes_1 = {0.65f,0.85f,1.50f,2.50f,3.0f};
        
        switch(negocio)
        {
            case "N":
                Negocio(kwatts);
            break;

            case "H":
                hogar(kwatts);
            break;
            
            default:
                System.out.println("not identified");
        }

        //float price;
        
        
        
               
    }
    //funciones del ejercicio 7
    public static int validarWats(Scanner nscan)
    {
        while(true){
            try {
            System.out.println("Ingrese el consumo en KW");
            int watts = nscan.nextInt();
            if(watts <=0 && watts >=5000 ){
                System.out.println("El wattaje es incorrecto o fuera de limite");
            }
            else{
                return watts;
            }
            }
            catch(Exception e){
                return 0;
            }
        }
    }

    public static String validarNegocio(Scanner nscan)
    {
        while(true){
            try {
            System.out.println("Ingrese si es negocio (N) o si es hogar (H)");
            String negocio = nscan.nextLine().toUpperCase();
            if(negocio.equals("N") || negocio.equals("H")){
                return negocio;
            }
            else{
                System.out.println("la entrada "+negocio +" no es valida, intente otra vez");
            }
            }
            catch(Exception e){
                return "0";
            }
        }
    }
    public static void hogar(int kwatts)
    {
        float price = 0;
        if(kwatts == 0)
        {
            System.out.println("ERROR! vuelva a ejecutar");
        }
        else if(kwatts > 0 && kwatts <= 250)
        {
            price = 0.65f * kwatts; 
            System.out.println("El valor a pagar es: " + price +"$ ");
        }
        else if(kwatts >= 251 && kwatts <= 500)
        {
            price = (kwatts-250)*0.85f + 250*0.65f; 
            System.out.println("El valor a pagar es: " + price +"$ ");
        }
        else if(kwatts >= 501 && kwatts <= 1200)
        {
            price = (kwatts-500)*1.50f + 250*0.85f + 250*0.65f ; 
            System.out.println("El valor a pagar es: "+price +"$ ");
        }
        else if(kwatts >= 1201 && kwatts <= 2100)
        {
            price = (kwatts-1200)*2.50f + 1.50f*700 + 250*0.85f + 250*0.65f ; 
            System.out.println("El valor a pagar es: "+price +"$ ");
        }
        else if(kwatts >= 2101)
        {
            price = (kwatts-2100)*3.00f+900 * 2.50f + 1.50f*700 + 250*0.85f + 250*0.65f; //(kwatts-2100)*3.00f + 2.50f*900 + 700*1.50f + 250*0.85f + 250*0.65f; 
            System.out.println("El valor a pagar es: "+price);
        }
        else
        {
            System.out.println("Error");
        } 
        

    }
     public static void Negocio(int kwatts)
    {
        float price = 0;
        if(kwatts == 0)
        {
            System.out.println("ERROR! vuelva a ejecutar");
        }
        else if(kwatts >= 1)
        {
            price = 5.0f*kwatts;
            System.out.println("El valor a pagar es: " + price +"$ ");

        }
        else
        {
            System.out.println("error");
        }
    }
}
