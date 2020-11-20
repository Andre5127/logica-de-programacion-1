//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-23
//DESCRIPTION:calculate the average salarytotal slary an higest salary of N employers where salary = (salary/30)*working days 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();
       double salary_average=0,salary_total=0,salary_higer=0,salary_temp;
       int N_employers=f_employers();
       for(int i=1 || i<=N_employers;i++){
       salary_temp=f_salary_one(i);
       salary_total=salary_total+salary_temp;
       if(salary_higer>salary_temp){
           salary_higer=salary_temp;
       }
       }
      salary_average= salary_total/N_employers;
      System.out.println("the total salary is $ "+salary_total+"the average salary is "+salary_average+
      "the higer salaryis "+salary_higer);
    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/_/_/_/softworkdays/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-23_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static int f_employers(){
        //description this metod returns the total employers to calculate
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("imput the total employers");
        int N_employers=keyboard.nextInt();
        while(N_employers<1 || N_employers>100){
        System.out.println("ERROR:your data sholud be between 1 and 100 imput again the total employers");  
        N_employers=keyboard.nextInt();
        }
        return N_employers;
    }

    public static double f_salary_one(int i){
    //Decription: this metod calculate the salary of one employer 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("imput the salary by the employer "+i+"$:");
    int salary=keyboard.nextInt();
    while (salary<1){
    System.out.println(" the salary should be greater than zero imput again the salary by the employer "+i+"$:");
    salary=keyboard.nextInt();    
    }
    System.out.println("imput the workdays in this month by the employer "+i+"$:");
    int workdays=keyboard.nextInt();
    while(workdays<1 || workdays>30){
        System.out.println(" the workdays should be between 1 and 30 input again the workdaysfor thr rmployer "+i+"$:");
        workdays=keyboard.nextInt();
    }
    double salary_employer =(salary/30)*workdays
    return salary_employer;
  }
}
