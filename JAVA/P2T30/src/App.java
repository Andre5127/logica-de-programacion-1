//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-nov-3
//DESCRIPTION: generate the price randomly fo N products  and save them in a vector 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int N_products= f_total_products();
        double v_iva=0, v_total_bill=0, v_average_price=0; 
        int v_vector_products[]= f_fill_vector_products(N_products);
        for(int i=0; i<N_products;i++){
            if(v_vector_products[i]>10000){
                v_iva=v_iva+(v_vector_products[i]*0.19);
                v_total_bill+=v_vector_products[i];
            }
        }
         v_average_price=(v_total_bill+v_iva)/N_products;
         System.out.println("gross value:$"+v_total_bill);
         System.out.println("tax(19%):$"+v_iva);
         System.out.println("total bill:$"+v_total_bill+v_iva);
         System.out.println("Average bill:$"+v_average_price);
    }

    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softvectorwhith/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-nov-3_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static int f_total_products(){
        //Description: this metod return the total products betwen 1-10000 for program
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total products do you need?");
        int v_total_products= keyboard.nextInt();
        while(v_total_products<1 || v_total_products>10000){
          System.out.println("ERROR the value should be between 1 to 10000, imput again the total products do you want:");
         v_total_products=keyboard.nextInt();
        }
        return v_total_products;
    }

    public static int[] f_fill_vector_products(int N_products){
//Description:this metod retrns  avector with a prices of the N products 
int[]v_vector= new int[N_products];
    for(int i=0; i<N_products; i++){
        //(Math.random()*(V_max-V_min ))+V_min 
    v_vector[i]=(int)  ((Math.random()*98000))+1000;
    }
    return v_vector;
    }
   



}
