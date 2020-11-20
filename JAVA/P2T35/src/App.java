//p1: lineas de comentarios de author, date y description
//AUTHOR: Andres Felpipe Torres Lopez
//DATE: 2020-Nov-18
//DESCRIPTION:this  software  simulate the rate food in the cafeteria for this 
// a scale of 1 to 10 was defined (1 denotes Horrible and 10 denotes Exelent) 


//p2: importar las librerias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_menu();
    int v_user_people = f_total_surveyed();
    int [][] v_matriz_survey=f_fill_matriz_survey(v_user_people);
    int v_bad_food=0;
    int v_regular_food=0;
    int v_exelent_food=0;
    int v_total_survey=0;
    for(int i=0;i<v_user_people;i++){    //to walk the rows
        for(int k=0;k<5;k++){            //to walk the colums      
            if(v_matriz_survey[i][k]<3){  
               v_bad_food+=1;            //adding one by one
          }else if (v_matriz_survey[i][k]<=6){
              v_regular_food+=1;         //adding one by one

          }else{
              v_exelent_food+=1;
          }

          v_total_survey+=1;
        }

      }
     f_show_matriz_value(v_matriz_survey);
     System.out.println("\n-----------------totals-------------");
     System.out.println("total survey:"+v_total_survey+ "(100%)");
     System.out.println("total bad food:"+v_bad_food + "("+(v_bad_food*100)/v_total_survey+"%)") ;
     System.out.println("total regular food:"+v_regular_food + "("+(v_regular_food*100)/v_total_survey+"%)");
     System.out.println("total exelent food:"+v_exelent_food + "("+(v_exelent_food*100)/v_total_survey+"%)");
    
    }
     //p3: crear el metodo de f_introduction()  <-- nos muestra información inicial del soft
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/ Softsurveyfood _/_/_/_/_/_/");
        System.out.println("_/_/_/_Version 1.0 2020-Nov-18_/_/_/_/_/");
        System.out.println("_/_maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    //p4.1 how many people surveyed 
    public static int f_total_surveyed(){
    //Description:this method returns the total people than surveyed 
    Scanner keyboard = new Scanner (System.in);
    System.out.println("how may people do you want");
    int v_total_people = keyboard.nextInt();
    while(v_total_people<1 || v_total_people>1000){
        System.out.println("ERROR your value must be between 1 and 1000 how many people do you want");
        v_total_people = keyboard.nextInt();
    }
    return v_total_people;
}

    //p4.2 make  to matris and to fill
    public static int [][] f_fill_matriz_survey(int v_user_people){
    //Description:this method returns the matriz Nx5 whit values between 1 to 10
    int[][]v_matriz_survey=new int[v_user_people][5];
    for(int i=0;i<v_user_people;i++){
      for(int j=0;j<5;j++){
        v_matriz_survey[i][j]= (int)(Math.random()*9)+1;
        }
      }
     return v_matriz_survey;
    }

    public static void f_show_matriz_value(int[][]v_matriz_survey){
        //Description: this method showthe matrix values 
        for(int i=0; i<v_matriz_survey.length;i++){
        System.out.print("\n ["+i+"]: ");
        for(int k=0;k<5;k++){
            System.out.print(v_matriz_survey[i][k]+" | ");
        }
        }
        
    }
}
