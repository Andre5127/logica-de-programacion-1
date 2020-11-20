//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-08
//DESCRIPTION: this program calculate the volume of a cylinder

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
     System.out.println("P2T11 Grades  maked by Andres Felipe Torres Lopez");
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_"); 

     Scanner keyboard = new Scanner(System.in);

     System.out.println("imput the 1° gade(20%) the value should be ebtween 0 and 5:");
     double g1 = keyboard.nextDouble();

     System.out.println("imput the 2° gade(25%) the value should be ebtween 0 and 5:");
     double g2 = keyboard.nextDouble();

     System.out.println("imput the 3° gade(25%) the value should be ebtween 0 and 5:");
     double g3 = keyboard.nextDouble();

     System.out.println("imput the 4° gade(30%) the value should be ebtween 0 and 5:");
     double g4 = keyboard.nextDouble();


     
     if(g1<0||g1>5||g2<0||g2>5||g3<0||g3>5||g4<0||g4>5 ){
        
        System.err.println("ERROR g1, g2, g3, g4 have a invalid value");
        }else{
        
        double finalg=(g1*0.2)+(g2*0.25)+(g3*0.25)+(g4*0.3);
        System.out.println("the final grade is"+finalg);
        }



    }
}
