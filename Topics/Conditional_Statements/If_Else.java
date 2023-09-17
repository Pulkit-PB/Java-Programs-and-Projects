//Creating a program to get age input from user and returning the eligibility to cast vote

package Conditional_Statements;
import java.util.Scanner;
public class If_Else {
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        int age;
        
        //Getting input for the age using Scanner
        System.out.println("Enter you age:");
        age=in.nextInt();

        //applying if else statement to get a result based on a condition
        if(age>=18)
            System.out.println("You are eligible to vote!");
        
        else
            System.out.println("You are NOT eligible to vote!");
        
        in.close();
    }
    
}
