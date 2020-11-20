//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-15
//DESCRIPTION: Create a function that calculat a worker's salary keep in mind that the worker is paid for hours
// worked if the hours worked are greater than 80 hours the salary increases by 20% the hourlyreate is
// entered by the user


import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
     f_menu();
     f_salary();
     String option_user= f_continuar_yes_no();
     while(option_user.equals("y") ){
         f_salary();
         option_user= f_continuar_yes_no();

     }


    } 
     
     public static void f_menu(){
            //DESCRIPTION: show initial menu of the program
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
            System.out.println("/_/_/_/_/_/softsalaryandextras_/_/_/_/_/");
            System.out.println("/_/_/_/version 1.0 2020-oct-15_/_/_/_/_/");
            System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        }
   
     public static void f_salary(){
        //Description: this metod calculate the salary of a worker , every hour $20.000 > 80 $20%

        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total hours thath the worked by worker");

          int hours= keyboard.nextInt();
        int salary =0;
         while( hours<=0 ){
        
            System.out.println("ERROR: the hours should be greater than zero");   
        
            hours=keyboard.nextInt();
          }   
         
          if (hours>=80){
            int extra=hours-80;
               
            int salary_extra=extra*20000;
              
            salary=(80*20000)+extra;
            
            System.out.println("his/her salary is"+salary+"with extra hours"+extra+"with price"+salary_extra);
            
         
        
        
        
        }else{
             salary=(hours*20000);
             System.out.println("his/her salary is $"+salary);
         }
        
        }
   
     public static String f_continuar_yes_no(){
      //Description: this metod returns  yes(y)/no(n) to continue or not 
         Scanner keyboard = new Scanner(System.in);
         System.out.println("do you want to continue (y/n)");
         String option = keyboard.nextLine();
         while(option.equalsIgnoreCase("y") && option.equalsIgnoreCase("n")){
             System.out.println("ERROR: your option is'nt valid do you want to continur (y/n)");
             option = keyboard.nextLine();

         }
         return option;
     }
   
    }


