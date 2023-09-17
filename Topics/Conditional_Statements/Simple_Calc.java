package Conditional_Statements;
import java.util.Scanner;

public class Simple_Calc {

    
    
    public static int getdata()
    {
        int a;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter a number:");
        a=in.nextInt();
        
        return a;
    }
    public static void main(String [] args)
    {
        int x,y,ch;
        Scanner in = new Scanner(System.in); 


        x=getdata();
        y=getdata();
        int t=1;
        while(t==1)
        {
            System.out.println("Choose an option:\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit\n=>");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                {
                    int z;
                    z=x+y;
                    System.out.println("sum is: "+z);
                    break;
                }

                case 2:
                {
                    int z;
                    z=x-y;
                    System.out.println("subtraction is: "+z);
                    break;
                }

                case 3:
                {
                    int z;
                    z=x*y;
                    System.out.println("multiplication is: "+z);
                    break;
                }

                case 4:
                {
                    int z;
                    z=x/y;
                    System.out.println("Division is: "+z);
                    break;
                }

                case 5:
                {
                    int z;
                    z=x%y;
                    System.out.println("modulus is: "+z);
                    break;
                }
                
                case 6:
                {
                    t=0;
                    break;
                }

                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        }

        in.close();
    
    }
    
}
