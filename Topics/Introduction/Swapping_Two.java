//Swapping two numbers using different logic
package Introduction;

import java.util.Scanner;

public class Swapping_Two{

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two Numbers:");
        System.out.println("=>");
        a=in.nextInt();
        System.out.println("=>");
        b=in.nextInt();

        //Logic 1: Using a third identifier or variable
        System.out.println("Before Swapping=> a="+a+" b="+b);
        System.out.println("\n");
        int z=a;
        a=b;
        b=z;
        System.out.println("After Swapping=> a="+a+" b="+b);
        System.out.println("\n");
        
        //Logic 2: Using '+' and '-' and without a third variable
        System.out.println("Using '+' and '-'");
        a=a+b;      //taking a=5 and b=10 -> a=5+10, a=15
        b=a-b;      //b=15-10, b=5
        a=a-b;      //a=15-5, a=10
        System.out.println("After Swapping=> a="+a+" b="+b);
        System.out.println("\n");
        
        //Logic 3: Using '*' and '/' and without a third variable
        System.out.println("Using '*' and '/'");
        a=a*b;      //taking a=5 and b=10 -> a=5*10, a=50
        b=a/b;      //b=50/10, b=5
        a=a/b;      //a=50/5, a=10
        System.out.println("After Swapping=> a="+a+" b="+b);
        System.out.println("\n");

        //Logic 4: Using Bitwise XOR '^' operator
        System.out.println("Using Bitwise XOR '^' operator");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping=> a="+a+" b="+b);
        System.out.println("\n");

        in.close();

    }
}