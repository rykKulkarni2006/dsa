import java.util.*;
public class condition{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int age= s.nextInt();

        System.out.println( age);

        if(age>=18){
            System.out.println("adult");
        
        }
        else if(age>13 && age<18){
            System.out.println("teen");
        }
        else {
            System.out.println("not adult");
        }
         
    }

}