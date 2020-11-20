//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-08
//DESCRIPTION: this program calculate the bike time etween two cyties 

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
     System.out.println("P2T12 timeSoft  maked by Andres Felipe Torres Lopez");
     System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_"); 

     Scanner keyboard = new Scanner(System.in);

     System.out.println("imput the ditance between two cyties (km)");

     double  distance = keyboard.nextDouble();

     if(distance<=0 ){
      
    System.out.println("ERROR the distance shold be greater than zero");

     }else{
     f_bike_time(distance);
     }
    }


public static void f_bike_time(double distance)     
{

//DESCRIPTION:this function/sub program calculate the timt time =distance/vel
Scanner keyboard1 = new Scanner(System.in);
System.out.println("imput th consttan velocity (km/h)");

double velocity = keyboard1.nextDouble();

if(velocity<=0){
    System.out.println("ERROR: the velosity should be grearter than zero");

}else{
double time=distance/velocity;

System.out.println("the time is"+time+"hours");

    }

   }
}