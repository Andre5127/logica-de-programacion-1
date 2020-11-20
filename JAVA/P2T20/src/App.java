//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-20
//DESCRIPTION:calcule the average height of a group of N children and generate yhe average

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
       
        f_menu();
        
        int user_total_children=f_total_children();
        double sum_heigth=0 ,average_heigth;
        for(int i=1; i<user_total_children; i=i+1){
            System.out.println("imput the heigth of the child number :"+i);
            sum_heigth+=keyboard.nextDouble();
            sum_heigth=sum_heigth/user_total_children;
            System.out.println("the total average by children"+user_total_children+" is "+average_heigth +"meters");
        }
      }
    
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/_/_/softbeverajemachine_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-20_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }
    
    public static int f_total_children(){
     //Description: this metod will return the total children than user imput
       Scanner keyboard = new Scanner(System.in);
       System.out.println("imput the total children");
      
       int total_children=keyboard.nextInt();{
       while(total_children<=0 || total_children>1000) {
       System.out.println("ERROR:the total children should be between one and 1000");
       total_children=keyboard.nextInt();

       }
      return total_children;
    }
    }

    public static double f_heigth_children(){
     //Description: this metod will return the heigth of a  children than user imput
       Scanner keyboard = new Scanner(System.in);
       System.out.println("imput the heigth of the children");
       double heigth_children=keyboard.nextDouble();{
       while(heigth_children<=0.30 || heigth_children<=1000) {
       System.out.println("ERROR:the total children should be between one and 1000");
       heigth_children=keyboard.nextDouble();

       }
      return heigth_children;
    }

    }
}


