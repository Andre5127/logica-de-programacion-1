//AUTHOR: Andres Felipe Torres Lopez
//DATE: 2020-nov-5
//DESCRIPTION:ask to de user enter a word of a least 6 characters by keyboard 
//the software must convert  thata word into a stiring array and then display each letter 
//with it's respective ASCII code on the screen


public class App {
public static void main(String[] args) throws Exception {
   f_menu();
   int[] v_vector_men=f_fill_vector_ages();
   int[] v_vector_women=f_fill_vector_ages();
   int[]v_totales={0,0,0,0,0,0,0,0};

   for(int i=0 ; i<v_vector_men.length;i++){

   }if(v_vector_women[i]<18){
       v_totales[1]=v_totales[1]+1;
   }else if(v_vector_women[i]<60){
       v_totales[3]=v_totales[3]+1;
   }else{
       v_totales[5]=v_totales[5]+1;
   }  
   v_totales[7]+=v_totales[7]+v_vector_women[i];

   //recorrer el vector de hombres 
    if(v_vector_men[i]<18){
       v_totales[1]=v_totales[1]+1;
    }else if(v_vector_men[i]<60){
       v_totales[2]=v_totales[2]+1;
    }else{
      v_totales[4]=v_totales[4]+1;
    }
v_totales[7]+=v_totales[7]+v_vector_men[i];
    
System.out.println("men"+v_totales[0]+"and women"+v_totales[1]+"are under the age of 18");
System.out.println("men"+v_totales[2]+"and women"+v_totales[3]+"are equals to or over 18 but under 60");
System.out.println("men"+v_totales[4]+"and women"+v_totales[5]+"equal or over 60 yeaars of age");
System.out.println("average age of womens :"+(v_totales[7]/v_vector_women.length)+"  and men :"+(v_totales[6]/v_vector_men.length));

System.out.println("----age of women--------");
for(int i=0; i<v_vector_women.length;i++){
    System.out.println("["+i+"]="+v_vector_women[i]);
}
System.out.println("----age of men--------");
for(int i=0; i<v_vector_men.length;i++){
    System.out.println("["+i+"]="+v_vector_men[i]);
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

    public static int[] f_fill_vector_ages(){
        //Description this method returns 100 numbers betwenn 10 and 100
        int[]v_vector = new int[10];
        for(int i=0; i<10;i++){
            v_vector[i]=(int) (Math.random()*99)+1;
        }
        return v_vector;
    } 
}
