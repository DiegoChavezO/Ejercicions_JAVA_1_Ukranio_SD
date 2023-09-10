import java.util.Scanner;
public class eje18 {
    public static void main(String[] args) {
        String[] ciudades = new String[10]; 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el nombre de la ciudad" + (i + 1) + ": ");
            ciudades[i] = scanner.nextLine();
        }
        String nombreMasLargo = "";
        for (String ciudad : ciudades) {
            if (ciudad.length() > nombreMasLargo.length()) {
                nombreMasLargo = ciudad;
            }
        }
        System.out.println("La ciudad con el nombre más largo es: " + nombreMasLargo);
    }
}


