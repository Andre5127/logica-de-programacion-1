//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-15
//DESCRIPTION: this programsimulate a beveraje machine

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option_user= f_option_averaje();
         
          while(option_user!=0){
           
            if(option_user==1){
                f_aromatic();     
            }else if(option_user==2){
                f_black_coffee();
            }else if(option_user==3){//coffee with milk
                f_coffee_whit_milk();
            }else if(option_user==4){//capucciono
                f_capuccino();
            }else if(option_user==5){//mochaccino
                f_mochaccino();
                 
            }
            option_user= f_option_averaje();}
          
        }
    
         public static void f_menu(){
            //DESCRIPTION: show initial menu of the program
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
            System.out.println("/_/_/_/_/_/softbeverajemachine_/_/_/_/_/");
            System.out.println("/_/_/_/version 1.0 2020-oct-15_/_/_/_/_/");
            System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        }
    
         public static int f_option_averaje()   {
       //Description:this metod  returns the option of beveraje 

       Scanner keyboard = new Scanner(System.in);
       int option=0;
       do{
       System.out.println("_/_/_/_/_/_/imput the option_/_/_/_/_/_/");
       System.out.println("_/_/_/_/_/_/°1 Aromatic---------1.300cop");
       System.out.println("_/_/_/_/_/_/°2 Black coff-------1.000cop");
       System.out.println("_/_/_/_/_/_/°3 coffee with milk-2.500cop");
       System.out.println("_/_/_/_/_/_/°4 capuccino--------2.500cop");
       System.out.println("_/_/_/_/_/_/°5 mocaccino--------2.700cop");
       System.out.println("_/_/_/_/_/_/°0 to exit_/_/_/_/_/_/_/_/_/");
       System.out.println("_/_/_/_/_/_/imput your option/_/_/_/_/_/");

       option= keyboard.nextInt();

       

       }while(option<0||option>5);
       return option;
    }
     
         public static int f_money(){
       //Descriptio:this metod returns the money entered in the machine
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the money");
  
        int money= keyboard.nextInt();
        while(money!=100 && money!=200 && money!=500 && money!=1000 && money!=2000 && money!=5000 ){
            System.out.println("ERROR:your money is unknow");
            money= keyboard.nextInt();
        }
         return money;

      }

         public static void f_aromatic(){
         //Description:this metod procces the aromatic averaje
         
         int price=1300;
         int money_user=f_money();
         while(money_user<price){
        System.out.println("do you need imput"+(price-money_user)+"money");
        money_user+=f_money();
         }
         int surplus = money_user- price;
         System.out.println("your surplus is "+surplus+"the aromatic has time finish 30 seg");
    }
         
         public static void f_black_coffee(){
        //Description:this metod procces the black coffee averaje
        
        int price=1000;
        int money_user=f_money();
        while(money_user<price){
       System.out.println("do you need imput"+(price-money_user)+"money");
       money_user+=f_money();
        }
        int surplus = money_user- price;
        System.out.println("your surplus is "+surplus+"the black coffee has time finish 30 seg");
    }

         public static void f_coffee_whit_milk(){
        //Description:this metod procces the coffee whit milk averaje
        
        int price=1900;
        int money_user=f_money();
        while(money_user<price){
       System.out.println("do you need imput"+(price-money_user)+"money");
       money_user+=f_money();
        }
        int surplus = money_user- price;
        System.out.println("your surplus is "+surplus+"the coffee whit milk has time finish 45 seg");
    }

         public static void f_capuccino(){
        //Description:this metod procces the capuccino averaje
        
        int price=2500;
        int money_user=f_money();
        while(money_user<price){
       System.out.println("do you need imput"+(price-money_user)+"money");
       money_user+=f_money();
        }
        int surplus = money_user- price;
        System.out.println("your surplus is "+surplus+"the capuccino has time finish 60 seg");
    }

         public static void f_mochaccino(){
        //Description:this metod procces the mochaccino averaje
        
        int price=2700;
        int money_user=f_money();
        while(money_user<price){
       System.out.println("do you need imput"+(price-money_user)+"money");
       money_user+=f_money();
        }
        int surplus = money_user- price;
        System.out.println("your surplus is "+surplus+"the mochaccino has time finish 70 seg");
    }
}
