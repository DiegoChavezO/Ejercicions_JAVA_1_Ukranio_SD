
public class clasejueves {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 0;
        for (int i = 1; i <=20; i++) { 
           
            d = a + b + c;
            a = b;
            b = c;
            c = d;
             System.out.println(d);
            

        }
        
    }
    
}
