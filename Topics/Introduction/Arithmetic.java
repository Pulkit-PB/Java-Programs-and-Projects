package Introduction;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        
        //creating a scanner object
        Scanner in =new Scanner(System.in);
        
        //declaration of variables
        int a,b,c;
        System.out.println("Enter 2 numbers:");
        System.out.println("=>");
        a=in.nextInt();
        System.out.println("=>");
        b=in.nextInt();

        //Adding both numbers
        c=a+b;
        //OUTPUT
        System.out.println("Sum of the given numbers: "+c);
        //Subtraction
        System.out.println("Subtraction of the given numbers: "+(a-b));
        //Multiplication
        System.out.println("Multiplication of the given numbers: "+(a*b));
        //Division
        System.out.println("Division of the given numbers: "+(a/b));
        //Modulus
        System.out.println("Modulus of the given numbers: "+(a%b));
        //Bitwise Operator
        System.out.println("Bitwise operation of the given numbers: "+(a>>b));
        System.out.println("Bitwise operation of the given numbers: "+(a<<b));
        in.close();
    }
    
}
