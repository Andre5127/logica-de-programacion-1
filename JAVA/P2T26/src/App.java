//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-26
//DESCRIPTION:calculate how many races can do an a sporter

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        double total_laps=0, sum_times=0,best_lap=0,worst_lap=0,average_time=0,time_lap;
        do{
         time_lap=f_time_lap();
         total_laps=+1;
         sum_times+=time_lap;
         if(total_laps==1){
           best_lap=time_lap;
           worst_lap=time_lap;
           sum_times=time_lap;

         }else{
              if(time_lap<best_lap){
              best_lap=time_lap;
              }if(time_lap>worst_lap){
                  worst_lap=time_lap;
              }
         }

        }while(f_option_continue().equalsIgnoreCase("Y"));
        average_time=time_lap/total_laps;
        System.out.println("----------results---------");
        System.out.println("total laps"+total_laps);
        System.out.println("sum times "+sum_times);
        System.out.println("average times"+average_time);
        System.out.println("worst lap"+worst_lap);
        System.out.println("best lap"+best_lap);

    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softmakemarket_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-23_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static String f_option_continue(){
        //Description:thismetod returns Y(yes) or N(no)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ms/mtr athletic do you want to continueY(yes) N(no)");
        String opt=keyboard.nextLine();
        while(!opt.equalsIgnoreCase("Y") && !opt.equalsIgnoreCase("N")){
           
            System.out.println("ERROR  ms/mtr athletic your option isn't valid do you want to continueY(yes) N(no)");
             opt=keyboard.nextLine();


        }
        return opt;
    }
   
    public static Double f_time_lap(){
        //Description:this metod returns a value between 5 sec and 59seg
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ms/mtr athletic imput the tieme lap");
        Double time_lap=keyboard.nextDouble();
        while(time_lap<5 ||time_lap>59){
        System.out.println("ERROR your value betwen  5 seg and59 seg ms/mtr athletic imput the tieme lap");
        time_lap=keyboard.nextDouble();

        }
        return time_lap;
    }
}
