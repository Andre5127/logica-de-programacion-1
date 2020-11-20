//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-26
//DESCRIPTION

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        f_menu();
        // System.out.println(Math.random());
        //Double v_num=(Math.random()*(1000000)+1000000);
        //System.out.println(v_num);

        //int v_num2=(int) v_num ; 
        //System.out.println(v_num2);
        int[] v_salary=new int[4];
        v_salary[0]=(int)(Math.random()*(1000000)+1000000);
        v_salary[1]=(int)(Math.random()*(1000000)+1000000);
        v_salary[2]=(int)(Math.random()*(1000000)+1000000);
        v_salary[3]=(int)(Math.random()*(1000000)+1000000);
       
       System.out.println("[0]:"+v_salary[0]);
       System.out.println("[1]:"+v_salary[1]);
       System.out.println("[2]:"+v_salary[2]);
       System.out.println("[3]:"+v_salary[3]);
        //Description:Math.random()*(v_max-v:min)+v_min
        //(0.02*(2.000.000-1.000.000)+1.000.000) (1.000.000 y 2.000.000)

    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softvectorwhith/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-23_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

}
