import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("P2T9 supermarket products maked by Andres Felipe Torres Lopez");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");


        int p1, p2, p3, p4, valbr;
        double iva, bill;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("imput the 1° product:");
        p1=keyboard.nextInt();
        
        System.out.println("imput the 2° product:");
        p2=keyboard.nextInt();    
        
        System.out.println("imput the 3° product:");
        p3=keyboard.nextInt();
    
        System.out.println("imput the 4° product:");
        p4=keyboard.nextInt();

        valbr= p1+p2+p3+p4;

        iva=valbr*0.19;
      
        bill=valbr+iva;

        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("-------the total bill is $"+bill+" with iva is $"+iva);
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
       

    }

}
