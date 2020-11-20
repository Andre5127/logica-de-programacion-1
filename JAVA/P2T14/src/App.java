//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-09
//DESCRIPTION: this program calculate the costfor he parcel service is based on the weigthof the package

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option = f_address();
        double weight=f_weight();
        double price =0;
        if(option==1){
           price=weight=11;    
        }else if (option==2){
            price=weight=10;
        }else if (option==3){
            price=weight=12;
        }else if (option==4){
            price=weight=24;
        }else{
            price=weight=27;
        }
        System.out.println("the price is"+price);
    }
    
    public static void f_menu(){
//DESCRIPTION: show initial menu of the program

System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
System.out.println("_/_/_/_/_/_/softcostParcel_/_/_/_/_/_/_/");
System.out.println("_/_/_/_/version 1.0 2020-oct-09_/_/_/_/_");
System.out.println("_/maked by Andres Felipe Torres Lopez_/_");
System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__");

    }

    public static int f_address(){
    //description:this progran return the option address 
Scanner keyboard=new Scanner(System.in);
    System.out.println("imput the option address ");
    System.out.println("1 nort America   ");
    System.out.println("2 central America");
    System.out.println("3 south America  ");
    System.out.println("4 Europe         ");
    System.out.println("5 Asia           ");
    
    int option=keyboard.nextInt();
 
    while(option<1||option>5){
   
    System.out.println("ERROR:your input the option address DON'T exsist, imput again");
    System.out.println("imput the option address ");
    System.out.println("1 nort America   ");
    System.out.println("2 central America");
    System.out.println("3 south America  ");
    System.out.println("4 Europe         ");
    System.out.println("5 Asia           ");
    
     option =keyboard.nextInt();
    }
    return option;  

  }

    public static double f_weight(){
    Scanner keyboard2 = new Scanner(System.in);
    System.out.println("imputh the weight(kg) of parcel");
    double weight=keyboard2.nextDouble();
    while(weight<=0){
    System.out.println("ERROR:this weight (kg) should be greater than zero, imput again the weight");
    weight=keyboard2.nextDouble();
        }
     return weight;
      }
  
}


