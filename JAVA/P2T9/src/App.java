//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-06
//DESCRIPTION: this program show the age of a person 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("P2T9 age of a person maked by Andres Felipe Torres Lopez");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("imput your year birht :");
        int year = keyboard.nextInt();

        if(year>2020){
        System.err.println("ERROR this year can't prosses , you should imput a year less than 20202");
        }else{
       
         int age = 2020-year;

        if( age > 18) {

            System.out.println("she/he is an adult");

          }else{

           System.out.println("she/he is a kid ");

          }


        }

    }
}
