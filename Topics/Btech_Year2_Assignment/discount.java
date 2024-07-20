package Btech_Year2_Assignment;

import java.util.Scanner;

public class discount {

    public void calc(double x)
    {
        if(x<=2000)
        {
            double fcost=x-((x*5)/100);
            System.out.println("The Discounted amount is:"+fcost);
        }
        else if(x>2000 && x<=5000)
        {
            double fcost=x-((x*25)/100);
            System.out.println("The Discounted amount is:"+fcost);
        }
        else if(x>5000 && x<=10000)
        {
            double fcost=x-((x*35)/100);
            System.out.println("The Discounted amount is:"+fcost);
        }
        else if(x>10000)
        {
            double fcost=x-((x*50)/100);
            System.out.println("The Discounted amount is:"+fcost);
        }
        else
        {
            System.out.println("Invalid Amount!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the Bill amount:");
        double bill=in.nextDouble();
        discount ob = new discount();
        ob.calc(bill);
        in.close();
    }
    
}
