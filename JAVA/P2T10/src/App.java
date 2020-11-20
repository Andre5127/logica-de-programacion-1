//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-06
//DESCRIPTION: this program calculate the volume of a cylinder 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
     System.out.println("P2T10 volume of a cylider  maked by Andres Felipe Torres Lopez");
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");   

     Scanner keyboard = new Scanner(System.in);

     System.out.println("imput the radio in(cm):");
     double r1 = keyboard.nextDouble();

     System.out.println("imput the heigth in(cm) :");
     double h1 = keyboard.nextDouble();


     if(r1<=0 || h1<=0 ){
        System.err.println("ERROR this radio or higth can't use, you shoul use imput a rdio or heigth higher than 0 ");
        }else{
        double vol= 3.141592*(r1*r1)*h1;

        System.out.println("valume is"+vol+"(cm3)");
        }
    }
}
