//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-22
//DESCRIPTION:determines the total saved for a peersonin N months yes-A person saved x amont of money each month

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int N_months = f_total_month();
        int sum_tot_saved=0 ;
        double average_total_saved=0;
        for(int i=1;i<=N_months;i++){
        sum_tot_saved+=f_save_money(i);
        }
        average_total_saved=sum_tot_saved/N_months;
        System.out.println("the total save money is"+sum_tot_saved+"total averaje  is "+average_total_saved);
    }

    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/_/_/_/softsavemoney_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-22_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static int f_total_month() {
        //Description:this metod returns the total months that usersaved money
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total months");
        int total_months= keyboard.nextInt();
        while(total_months<2 || total_months>12);{
        System.out.println("ERROR:imput the values should be beetwen  2 and 12 imput again the total months: ");
        total_months= keyboard.nextInt();
    }
    return total_months ;

   }
  
    public static int f_save_money(int i_month) {
    //Description : this metod return the save money int i month
    Scanner keyboard = new Scanner(System.in);
    System.out.println("imput th save money by the month "+i_month+":");
    int save_money= keyboard.nextInt();
    while(save_money<1000 || save_money>1000000){
    System.out.println("ERROR:imput the values should be beetwen  10000 and 1000000 imput again the total money by the month "+i_month+":");   
    save_money= keyboard.nextInt();
     }
     return save_money;
   }
}
