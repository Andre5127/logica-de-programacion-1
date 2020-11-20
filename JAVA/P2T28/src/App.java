//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-29
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        f_menu();
        int[] f_salary_day =f_turn_day();
        int[] f_salary_nigth =f_turn_nigth();
        int v_total_salary_day =0, v_total_salary_nigth =0;

        System.out.println("-----turn day-----");
        for(int i=0; i<8;i++){
            v_total_salary_day +=  v_salary_day[i];
            System.out.println("employer["+i+"]$"+v_salary_day[i]);

        }
        System.out.println("-----turn nigth-----");
        for(int i=0; i<8;i++){
            v_total_salary_nigth += v_salary_nigth[i];
            System.out.println("employer["+i+"]$"+v_salary_nigth[i] );
        }
        System.out.println("-----total salary-----"); 
        System.out.println("total salary day"+v_total_salary_day);
        System.out.println("total salary nigth"+v_total_salary_nigth);
        System.out.println("total salary(day+nigth)$"+v_total_salary_day+v_total_salary_nigth); 
    
    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softvectorwhith/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-29_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
   
 }
 
 public static int[] f_turn_day(){
//Description:this metod returns a vector with 8 salaary
int[] v_salary = new int[8];
for(int i=0; i<8; i++){
    v_salary[i] = (int) ((Math.random()*8)*29260);
}
return v_salary;
 }
 
 public static int[] f_turn_nigth(){
    //Description:this metod returns a vector with 8 salaary more 35%
    int[] v_salary_nigth = new int[8];
    for(int i=0; i<8; i++){
        v_salary_nigth[i] = (int) ((Math.random()*8)*38151);
    }
    return v_salary_nigth;
}
}
