package Btech_Year2_Assignment;
import java.util.Scanner;

public class if_Switch
{
    public static void main(String[] args) {
        
        /* Given statement:
        if(var==1)
            System.out.println("good");
        else if(var==2)
            System.out.println("better");
        else if(var==3)
            System.out.println("best");
        else
            System.out.println("invalid");
         */

        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a position:");
        int n=in.nextInt();

        //Using Switch statement
        switch(n)
        {
            case 1:
            {
                System.out.println("good");
                break;
            }
            case 2:
            {
                System.out.println("better");
                break;
            }
            case 3:
            {
                System.out.println("best");
                break;
            }
            default:
            {
                System.out.println("invalid");
            }
        }
        in.close();        

    }
}
