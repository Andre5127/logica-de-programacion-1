import java.util.Scanner;

//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-oct-26
//DESCRIPTION:caooture and algoari that capture the price 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        f_menu(); 
        Scanner keyboard = new Scanner(System.in);
        int bill_market=0,total_product,tmp_product;

        do{

            System.out.println("please pass the product through the nill machine ");
            tmp_product=keyboard.nextInt();
            bill_market=bill_market+tmp_product;
            total_product=1;
            System.out.println("you invoice is"+bill_market+"whit"+total_product+"products");
        }while(bill_market<=500000);
        if(bill_market>500000){
        bill_market=bill_market-tmp_product;
        total_product=total_product-1;


        }
        System.out.println("your final invoice is "+bill_market+"whit"+total_product+"produccts");
    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/softmakemarket_/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-oct-23_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

}
