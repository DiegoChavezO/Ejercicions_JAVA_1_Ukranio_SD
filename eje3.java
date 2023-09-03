import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        float AB,BC,AC,area,semiper,radio;
        Scanner myObj = new Scanner(System.in);
        System.out.println("ingrese AB: ");
        AB = myObj.nextInt();
        System.out.println("ingrese BC: ");
        BC = myObj.nextInt();
        System.out.println("ingrese AC: ");
        AC = myObj.nextInt();
        semiper = (AB+BC+AC) / 2;
        area = (float)Math.sqrt(semiper * (semiper-AB) * (semiper-BC) * (semiper-AC));
        radio = area / semiper;
        System.out.println("el radio es: "+radio);
        
    }
    
}
