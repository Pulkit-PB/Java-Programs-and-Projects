package Btech_Year2_Assignment;
import java.util.Scanner;

public class SI {

    Scanner in = new Scanner(System.in);
    Float Principal;
    Float Rate;
    Float Time;

    public void input()
    {
        System.out.println("Enter the Principal:");
        Principal=in.nextFloat();
        System.out.println("Enter the Rate:");
        Rate=in.nextFloat();
        System.out.println("Enter the Time:");
        Time=in.nextFloat();

    }

    public void calc()
    {
        Float interest=0f;
        interest=(Principal*Rate*Time)/100; 
        System.out.println("The interest according to given information : "+interest);
    }

    public static void main(String[] args) {
        
        SI obj1 = new SI();
        obj1.input();
        obj1.calc();
    }
    
}
