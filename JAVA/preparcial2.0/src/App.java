import java.util.Scanner;
                               
public class App {
//p1: lineas de comentarios de author, date y description
//AUTHOR: Andres Felpipe Torres Lopez and Lna Maria Sanchez Romero
//DATE: 2020-Nov-18
//DESCRIPTION:this  software  simulate the rate food in the cafeteria for this 
// a scale of 1 to 10 was defined (1 denotes Horrible and 10 denotes Exelent) 
    public static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        f_menu();
        
        int rows= f_total_rows();
        int columns=f_total_columns();
        int[][] matrix_numbers=new int[rows][columns]; //the matrix is empty
        matrix_numbers=f_fill_matrix(matrix_numbers);  //fill de matrix with numbers

        System.out.println("Input the number of the row:");
        int number_row=keyboard.nextInt();
        int summatory=0;
        double average=0;
        while (number_row>=0 && number_row<matrix_numbers.length-1){
            System.out.println();
            for (int j=0; j<matrix_numbers[1].length;j++){   //to walk only the columns
                System.out.print(" || "+matrix_numbers[number_row][j]);
                summatory+=matrix_numbers[number_row][j];
            }
            f_show_matriz_value(matrix_numbers);
            average=summatory/matrix_numbers[1].length;
            System.out.println("\nby number row "+number_row+", the sum is "+summatory+ " and the average is "+average);
            System.out.println("Input other number of the row:");
            number_row=keyboard.nextInt();
        while(f_option_continue().equalsIgnoreCase("N"));
        }
        System.out.println("--thanks--");


    }
    
    public static void f_menu(){
        //DESCRIPTION: This method show the initial menu and returns the total rows of a matrix
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
        System.out.println("_/_/_/_/_/_/ Softmunicipalities _/_/_/_/");
        System.out.println("/_/_/_/Version 1.0 2020-Nov-18_/_/_/_/_/");
        System.out.println("/_/maked by Andres Felipe Torres Lopez_/");
        System.out.println("_/_/_/and Lina Maria Samchez Romero/_/_/");
        System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
       
    }
    
    public static int f_total_rows(){   
    System.out.println("input who many rows do you want in the matrix?");
    int total_rows= keyboard.nextInt();
    while (total_rows<=0){
        System.err.println("ERR: the  value must greater than zero");
        System.out.println("input Again who many total rows do you want?");
        total_rows= keyboard.nextInt();
    }
    return total_rows;
    }
    
    public static int f_total_columns() {
        //DESCRIPTION: This method returns the total columns of a matrix

        System.out.println("input who many columns do you want in the matrix?");
        int total_columns= keyboard.nextInt();
        while (total_columns<=0){
            System.err.println("ERR: the  value must greater than zero");
            System.out.println("input Again who many total columns do you want?");
            total_columns= keyboard.nextInt();
        }
        return total_columns;
    }
  
    public  static int[][] f_fill_matrix(int[][] matrix_numbers){  //input the empty matrix
        //description: this methods fill the matrix
        for (int i=0;i<matrix_numbers.length;i++){ //to walk the rows | the total rows=matrix_numbers.length
            for(int j=0; j<matrix_numbers[0].length;j++){ //to walk the columns | the total columns=matrix_numbers[0].length
                matrix_numbers[i][j]= (int) Math.floor((Math.random()*1000)+1); //Math.random() = (0.00 y 0.99)
            }
        }
        return matrix_numbers;   //return a fill matrix
    }
    public static void f_show_matriz_value(int[][]f_fill_matrix){
        //Description: this method showthe matrix values 
        for(int i=0; i<f_fill_matrix.length;i++){
        System.out.print("\n ["+i+"]: ");
        for(int k=0;k<5;k++){
            System.out.print(f_fill_matrix[i][k]+" | ");
        }
        }
        
    }
    public static String f_option_continue(){
        //Description:thismetod returns Y(yes) or N(no)
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" do you want to continueY(yes) N(no)");
        String opt=keyboard.nextLine();
        while(!opt.equalsIgnoreCase("Y") && !opt.equalsIgnoreCase("N")){
           
            System.out.println("ERROR   your option isn't valid do you want to continueY(yes) N(no)");
             opt=keyboard.nextLine();


        }
        return opt;
    }
}