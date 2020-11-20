//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-22
//DESCRIPTION:read from the keyboard a series of numbers until you get one lower than 100
//in the end determine the sum and average of the number entered

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner keyboard = new  Scanner(System.in);
        double average_number =0, sum_numbers=0;
        int N_numbers=0;  
        System.out.println("imput any number ");
        int number= keyboard.nextInt();
        while(number>100){
        sum_numbers= sum_numbers +  number;
        N_numbers=N_numbers+1;
        System.out.println("imput other any number ");
         number= keyboard.nextInt();
        }
    if(N_numbers!=0){
     average_number= sum_numbers/N_numbers;
    }
    System.out.println("teh sum is "+sum_numbers+",average "+average_number+"total numbers are "+N_numbers);
    }

}
