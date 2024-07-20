package Btech_Year2_Assignment;
import java.util.Scanner;

public class triangle {
    Scanner in = new Scanner(System.in);
    Float A;
    Float B;
    Float C;

    public void input()
    {
        System.out.println("Enter an angle:");
        A=in.nextFloat();
        System.out.println("Enter an angle:");
        B=in.nextFloat();
        System.out.println("Enter an angle:");
        C=in.nextFloat();
    }

    public int check()
    {
        Float z=A+B+C;
        if(z==180)
        {
            System.out.println("Triangle confirmed");
            return 1;
        }
        else
        {    
            System.out.println("Invalid Angles");
            return 0;
        }
    }

    public void typecheck()
    {
        if(A==B && B==C && C==A)
        {
            System.out.println("Equilateral triangle");
        }
        else if((A==B && A!=C) || (A==C && A!=B) || (B==C && B!=A))
        {
            System.out.println("Isosceles triangle");
        }
        else if(A!=B && B!=C && A!=C)
        {
            System.out.println("Scalene triangle");
        }
        else{
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Input a Triangle's angles");
        triangle ob = new triangle();
        ob.input();
        int x = ob.check();
        if(x==1)
        {
            ob.typecheck();
        }
        
    }
    
}
