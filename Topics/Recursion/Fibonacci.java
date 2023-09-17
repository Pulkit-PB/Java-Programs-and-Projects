package Recursion;

import java.util.Scanner;

public class Fibonacci{

    public static int Fib(int x)
    {
               
        if(x==0)
        {
            return 0;
        }

        else if(x==1||x==2)
        {
            return 1;
        }

        return Fib(x-1)+Fib(x-2);
    }
/*
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int y;
        System.out.println("Enter the Number of elements of the series to be printed:\t");
        y=in.nextInt();
        System.out.println("\n");
        System.out.println("The Fibonacci Series till "+y+" elements is");
        
        for(int i=0;i<y;i++)
        {
            System.out.println(Fib(i) + "  ");
        }
        in.close();
    }
*/
    //The above Method has Time Complexity as exponential O(2^n) and Space Complexity as O(n). Hence, Inefficient

    static int a=0,b=1,t=0;

    public static void Fib1(int x)
    {
        if(x>0)
        {
            t=a+b;
            a=b;
            b=t;

            System.out.println(t+" ");
            Fib1(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        int key;
        System.out.println("Enter the no. of elements of the series to be displayed:");
        key=into.nextInt();

        System.out.println("The fibonacci series till "+key+" is:");
        System.out.println(a+"\n"+b);
        //calling method to print the fibonacci series till the key-2 limit since first 2 elements are already printed
        Fib1(key-2);
        into.close();

    }

}
    

