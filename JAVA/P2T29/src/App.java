//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-29
//DESCRIPTION: generate the age random for N people and save it in a vector 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();
       int N_people= f_total_people();
       int[] v_vector_age= f_fill_vector_age_people( N_people);

       int v_total_children=0, V_total_adults=0, v_total_seniors=0, v_sum_ages=0;
       
       for(int i=0; i<N_people;i++){
        if(v_vector_age[i]<18){
            V_total_adults+=1;    
        }else if(v_vector_age[i]>=18 && v_vector_age[i]<60){
            V_total_adults+=1;
        }else{
            v_total_seniors+=1;
        }
        v_sum_ages=v_sum_ages+v_vector_age[i];
        System.out.println("Age of person ["+i+"] : "+v_vector_age[i]);

        } 
      double v_average_age= v_sum_ages/N_people;
      System.out.println("------totals------");
      System.out.println("total childres: "+v_total_children);
      System.out.println("total adults: "+V_total_adults); 
      System.out.println("total seniors: "+v_total_seniors);
      System.out.println("total average: "+v_average_age);
    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softvectorwhith/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-29_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static int f_total_people(){
        //Description: this metod return the total person for program
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total people do you need?");
        int v_total_people= keyboard.nextInt();
        while(v_total_people<1 || v_total_people>1000){
          System.out.println("ERROR the value should be between 1 to 1000, imput again the total people do you want:");
         v_total_people=keyboard.nextInt();
        }
        return v_total_people;
    }

    public static int[] f_fill_vector_age_people(int N){
    //Description:this metod return a vector with agefor N people 
    int[] v_vector_age= new int[N];
    for(int i=0; i<N; i++){

   v_vector_age[i]= (int) (Math.random()*100)+1;

    }
    return v_vector_age;
    }


}
