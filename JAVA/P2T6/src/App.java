import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("P2T9 supermarket products maked by Andres Felipe Torres Lopez");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("imput the first number  :");
        int num1=keyboard.nextInt();

        System.out.println("imput the second number  :");
        int num2=keyboard.nextInt();

        int resu= num1-num2;

        
        System.out.println("the substract is "+resu);

    }
}
