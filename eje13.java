/*
 * Calcular cuanto dinero tendría en una cuenta de ahorro al final de 20 años si al inicio de cada 
    año añado $10,000, el rendimiento anual es 5% y reinvierto las ganancias obtenidas cada año. 
 */
public class eje13 {
    public static void main(String[] args) {
        float montoTrasAno = 10000;
        for(int anos= 1; anos<=20; anos++)
        {
            montoTrasAno += (montoTrasAno*0.05f);
        }
        System.out.println(montoTrasAno);
    }    
}
