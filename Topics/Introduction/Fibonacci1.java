package Introduction;
import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of elements of the series to be printed:");
        int n=in.nextInt();
        int x=-1,y=0,z=1;
        System.out.println("The Fibonacci series is :\n");
        for(int i=0;i<n;i++)
        {
            y=x+z;
            x=z;
            z=y;
            
            System.out.println("=> "+y);

        }
        in.close();
    }    
}
