//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-09
//DESCRIPTION:this program that uses diferent mrthods to
//°c to °f,°f to c°,k°to c°,c° to k°

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option= f_option_convert();
        if(option==1){
           f_convert_c_f();   
        }else if(option==2){
           f_convert_f_c();
        }else if(option==3){
           f_convert_k_c();
        }else{
            f_convert_c_k();
        }

    }

    public static void f_menu(){
     //DESCRIPTION: show initial menu of the program
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
     System.out.println("_/_/_/_/_/_/softcostParcel_/_/_/_/_/_/_/");
     System.out.println("_/_/_/_/version 1.0 2020-oct-09_/_/_/_/_");
     System.out.println("_/maked by Andres Felipe Torres Lopez_/_");
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__");
    }

    public static int f_option_convert(){
   //description:this progran return the option convert 

   Scanner keyboard=new Scanner(System.in);
    
    System.out.println("imput the option address ");
    System.out.println("1-°c to f°");
    System.out.println("2-°f to c°");
    System.out.println("3-°k to c°");
    System.out.println("4-°c to k°");

    int option=keyboard.nextInt();

    while(option<1 || option>4){

     System.out.println("ERROR : your imput the option address DON'T exist , imput again:");
     System.out.println("1-°c to f°");
     System.out.println("2-°f to c°");
     System.out.println("3-°k to c°");
     System.out.println("4-°c to k°");

     option=keyboard.nextInt();
    }
    
     return option;

    } 

    public static void f_convert_c_f(){
    //DESCRIPTION:this program realice convert from °c to °f
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----convert to °c to °f-----");
        System.out.println("imput the value of °c:");
        double  value=keyboard.nextDouble();
        double convert=(value*1.8)+32;
        System.out.println(value+"°c is"+convert+"°f");
    }

    public static void f_convert_f_c(){
        //DESCRIPTION:this program realice convert from °f to °c
            Scanner keyboard = new Scanner(System.in);
            System.out.println("----convert to °f to °c-----");
            System.out.println("imput the value of °f:");
            double  value=keyboard.nextDouble();
            double convert=(value-32)/1.8;
            System.out.println(value+"°f is"+convert+"°c");

}

    public static void f_convert_c_k(){
    //DESCRIPTION:this program realice convert from °c to °k
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----convert to °c to °k-----");
        System.out.println("imput the value of °c:");
        double  value=keyboard.nextDouble();
        double convert=(value+273.15);
        System.out.println(value+"°f is"+convert+"°c");
}

    public static void f_convert_k_c(){
    //DESCRIPTION:this program realice convert from °k to °c
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----convert to °k to °c-----");
        System.out.println("imput the value of °k:");
        double  value=keyboard.nextDouble();
        double convert=(value-273.15);
        System.out.println(value+"°f is"+convert+"°c");
}






}