package Loops;
import java.util.Scanner;

public class Armstrong{
    public static boolean arst(int x)
    {
        int temp=x;
        int s,sum=0;
        while(temp!=0)
        {
            s=temp%10;
            sum=sum+(s*s*s);
            temp/=10;
        }

        if(sum==x)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to check for Armstrong:");
        num=in.nextInt();
        
        
        //Calling method arst() to check for armstrong
        System.out.println("The condition of Armstrong for the given number is "+arst(num));
        in.close();        
    }
}