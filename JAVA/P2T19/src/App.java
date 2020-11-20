//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-19
//DESCRIPTION:created a metod that returns the firsletter of a word enter as a parameter 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     f_menu();
     Scanner keyboard = mew Scanner (System.in);
     System.out.println("imput a word ");
     String word= keyboard.nextLine();
     while(word.length()<5){
        System.out.println("ERROR:you word shuold have at leas five letters ");    
        word = keyboard.nextLine();
     }
 
    }

    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/_/_/softsting_/_/_/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-15_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static String f_firts_letter(String word ){
    String firts_letter=word.substring(0);
System.out.println("the first letter is"+first_letter);
    }




}
