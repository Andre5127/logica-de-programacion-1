import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t6_hypotenuse maker by Mauricio bravo and Andres torres");
        int C1, C2; 
        double Hipotenuse;
        Scanner Keyboard = new Scanner (System.in);
        
        System.out.println("input the first value");
        C1 = Keyboard.nextInt();

        System.out.println("input the second value");
        C2 = Keyboard.nextInt();
        
        Hipotenuse = Math.sqrt((C1*C1)+(C2*C2));

        System.out.println("The Hipotenuse is"+Hipotenuse );
     }
}
