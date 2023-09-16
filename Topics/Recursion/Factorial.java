package Recursion;
import java.util.Scanner;
public class Factorial {

    public static long fact(int x)
    {
        long temp=x;

        if(x==0||x==1)
        {
            return x;
        }
        else
        {
            temp=temp*fact(x-1);
            return temp;
        }
    }  
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int y;
        System.out.println("Enter the Number to get factorial!:\t");
        y=in.nextInt();
        long fc=fact(y);
        System.out.println("Factorial of "+ y +" is "+ fc);
        in.close();
    }
    
}
   

