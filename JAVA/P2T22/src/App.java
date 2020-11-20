

//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-22
//DESCRIPTION:this program calculate the bill of a maeket 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     f_menu();
     int sum = 0 ;
     int products=f_products();
     for(int i=1; i<=products;i++){
         sum= sum+f_value_products( i);

     }
     Double IVA= sum*0.19;
     double total_bill=sum+IVA;
     System.out.println("the value bruto"+sum+"the total bill is"+total_bill);
    }
        public static void f_menu(){
            //DESCRIPTION: show initial menu of the program
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
            System.out.println("/_/_/_/_/_/_/softsavemoney_/_/_/_/_/_/_/");
            System.out.println("/_/_/_/version 1.0 2020-oct-22_/_/_/_/_/");
            System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
            System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        }
    
    
    
    public static int f_products() {
        //Description:this metod show the total products 
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("imput the total products");
        int f_products= keyboard1.nextInt();
        while(f_products<1);{
        System.out.println("ERROR:imput the values should be grater than 1 ");
       f_products= keyboard1.nextInt();
    
    }

    return f_products ;
    }

    
    public static int f_value_products(int i) {
        //Description:this metod show the total products 
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("imput the total products "+i);
        int f_value_products= keyboard2.nextInt();
        while(f_value_products<50);{
        System.out.println("ERROR:imput the values should be grater than 1 "+i);
       f_value_products= keyboard2.nextInt();
    
    }

    return f_value_products ;
}
}

