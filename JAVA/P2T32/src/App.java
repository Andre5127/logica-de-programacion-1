//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-nov-5
//DESCRIPTION:ask to de user enter a word of a least 6 characters by keyboard 
//the software must convert  thata word into a stiring array and then display each letter 
//with it's respective ASCII code on the screen  

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    f_menu();
    String v_user_word= f_user_string();
    int v_chart_ascci;
    String[] v_vector_word = new String[v_user_word.length()];
    for(int i=0; i<v_user_word.length();i++){
        v_vector_word[i]=v_user_word.substring(i, i+1);
        v_chart_ascci=(int) v_vector_word[i].charAt(0);
        System.out.println("v_vector_word["+i+"]="+v_vector_word[i]+"ASCII:"+ v_chart_ascci);

    }
    }
    public static void f_menu(){
        //DESCRIPTION: show initial menu of the program
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_softlotterymachine/_/_/_/_/_/_/");
        System.out.println("/_/_/_/version 1.0 2020-nov-5/_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
    }

    public static String f_user_string(){
    //Description: this method returns a word whit minimun six characters 
    Scanner keyboard = new Scanner (System.in);
    System.out.println("imput a word ");
    String v_word= keyboard .nextLine();
    while(v_word.length()<6){
     System.out.println("ERROR your word should be minimum 6 characters input again you word ");   
    }
    return v_word;
    }

}
