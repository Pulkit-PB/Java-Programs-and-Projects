package Searching;

import java.util.Scanner;



public class Linear_S
{
    
    public static int LS(int arr[], int y)
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value to Search: ");
        int j=in.nextInt();
        int i=0;
        for(i=0;i<y;i++)
        {
            if(arr[i]==j)
            {
                break;                
            }
            
        }
        in.close();

        return i;
        
    }

    public static int[] create_Arr(int z)
    {
        Scanner in = new Scanner(System.in);
        
        int arr[];
        arr=new int[z];

        for(int i=0;i<z;i++)
        {
            System.out.println("Enter an element: ");
            arr[i]=in.nextInt();
        }
        in.close();
        return arr;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int z;
        System.out.println("Enter the is size of the array: ");
        z=in.nextInt();
        
        int[] arr;
        arr=create_Arr(z);
        int x;
        x=LS(arr,z);
        System.out.println("The element was found at: "+x);
        in.close();
    
    }
}
