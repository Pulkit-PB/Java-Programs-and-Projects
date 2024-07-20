package Btech_Year2_Assignment;

import java.util.Scanner;

public class Book {
    int Book_No;
    String Book_Title;
    Float Price;

    Scanner in = new Scanner(System.in);

    public void Input()
    {
        System.out.println("Enter Book No.:");
        Book_No=in.nextInt();
        System.out.println("Enter the Book Title:");
        Book_Title=in.next();
        System.out.println("Enter the Price:");
        Price=in.nextFloat();
    }
    
    public void Total_Cost(int x)
    {
        Float costf=x*Price;
        System.out.println("The cost for "+x+" no. of copies is:"+costf);
    }

    public void Purchase()
    {
        System.out.println("Enter the no. of copies to buy:");
        int q=in.nextInt();
        Total_Cost(q);

    }

    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        
        System.out.println("Add a Book=>");
        Book ob = new Book();
        ob.Input();

        System.out.println("Do you want to buy the book?[0/1]");
        int n=into.nextInt();
        

        if(n==1)
        {
            ob.Purchase();
        }
        else{
            return;
        }

        
        

    }
}
