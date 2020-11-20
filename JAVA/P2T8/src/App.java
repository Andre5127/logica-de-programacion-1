import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
    
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("P2T8 hipotenuse maked by Andres Felipe Torres Lopez");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
    
        int c1, c2;
        double hipotenuse;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("imput the 1° value :");
        c1=keyboard.nextInt();

        System.out.println("imput the 2° value :");
        c2=keyboard.nextInt();

        hipotenuse= Math.sqrt((c1*c1)+(c2*c2));

        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("th hipotenuse is"+hipotenuse);
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
    }


}
