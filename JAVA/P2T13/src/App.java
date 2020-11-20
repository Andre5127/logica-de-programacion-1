//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-09
//DESCRIPTION: this program calculate the saved money that a person save for N months

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        System.out.println("P2T13 timeSoft  maked by Andres Felipe Torres Lopez");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
        Scanner keyboard = new Scanner(System.in);
        f_menu();

        System.out.println("imput the total months");

        int mo = keyboard.nextInt();
        double save_money=0;
        if(mo<=0){
        System.out.println("ERROR:the months shoul greater than zero");
        }else{
        save_money= f_money(mo);
        System.out.println("the money savedduring"+mo+"months is "+save_money);
        }
    }

    public static void f_menu(){
    //DESCRIPTION: show initial menu of the program

    System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
    System.out.println("_/_/_/_/_/_/softSaveMoney_/_/_/_/_/_/_/");
    System.out.println("_/_/_/_/version 1.0 2020-oct-09_/_/_/_/");
    System.out.println("_/maked by Andres Felipe Torres Lopez_/");
    System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
    }
    
    public static double f_money(int months ) {
    // this subprogram/function calculate the save money
    
    Scanner keyboard1 = new Scanner(System.in);
    double tot_save = 0;
    System.out.println("imput the monthly salary");
    double salary=keyboard1.nextInt();
   
    if(salary<=0){
    System.out.println("ERROR:the months shoul greater than zero");
     tot_save=0;
     }else{
     tot_save=(salary*0.6)*months;

     }

      return tot_save;

    }

}
