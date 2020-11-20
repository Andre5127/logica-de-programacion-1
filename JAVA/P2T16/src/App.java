//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-15
//DESCRIPTION:this sowftwarw  maked many functions like convert 
//kilometers to miles
//colombian pesos to dollas and dollars to colombian pesos 

import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception{
       f_menu();
       int user_option=f_option();

       while(user_option!=0){
             
       }if(user_option==1){
             f_calculate_m_km();
       }else if(user_option==2){
             f_calculate_km_m();
       }else if(user_option==3){
             f_calculate_usd_to_pesos_co();
       }else{
             f_calculate_pesos_co_to_usd();
        }
         user_option=f_option();
        }
       
     public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softconvert_/_/_/_/_/_/_/_/_");
        System.out.println("_/_/_/_/version 1.0 2020-oct-15_/_/_/_/_");
        System.out.println("_/maked by Andres Felipe Torres Lopez_/_");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
       }

     public static int f_option(){
        //Description: this metod return the option  that imput the user 
        Scanner keyboard1=new Scanner (System.in);
        System.out.println("imput the option to convert:\n 1- miles to kilometers\n 2-km to miles");
        System.out.println("3-money usd to pesos co\n 4- money pesos co to usd\n 0- to exit");
        int option= keyboard1.nextInt();
        while(option<0 || option>4)
        System.out.println("ERROR:imput the option to convert:\n 1- miles to kilometers\n 2-km to miles");
        System.out.println("3-money usd to pesos co\n 4- money pesos co to usd\n 0- to exit");
         option= keyboard1.nextInt();
          
      return option ;
    }
 
     public static void f_calculate_m_km(){
       //DESCRIPTION:this program calculate aconvertion of miles to km
       Scanner keyboard1=new Scanner (System.in);
       System.out.println("-------miles to kilometres ");
       System.out.println("imput the total miles      ");
       double miles=keyboard1.nextDouble();
       double km = miles*0.621371;
       System.out.println("the"+miles+"miles concert to"+km+"km" );
   }
  
     public static void f_calculate_km_m(){

    //DESCRIPTION:this program calculate aconvertion of km to m
    Scanner keyboard1=new Scanner (System.in);
    System.out.println("-------km to miles");
    System.out.println("imput the total kilometers");
    double km=keyboard1.nextDouble();
    double miles = km*0.621371;
    System.out.println("the"+miles+"miles concert to"+km+"km" );
     }
    
     public static void f_calculate_usd_to_pesos_co(){
    //DESCRIPTION:this program calculate aconvertion of usd to colombian pesos
    Scanner keyboard1=new Scanner (System.in);
    System.out.println("-------usd to colombian pesos---------");
    System.out.println("imput the total usd");
    double usd =keyboard1.nextDouble();
    double pesos=usd*3840;
    System.out.println("the"+usd+"dollars concert to"+pesos+"colombian peoss" );
}

     public static void f_calculate_pesos_co_to_usd(){
    //DESCRIPTION:this program calculate aconvertion of pesos co to usd
    Scanner keyboard1=new Scanner (System.in);
    System.out.println("-------colombian pesos to usd---------");
    System.out.println("imput the total colombian pesos");
    double cop =keyboard1.nextDouble();
    double usd=cop/3840;
    System.out.println("the"+cop+"dollars concert to"+usd+"colombian peoss" );


}
}



