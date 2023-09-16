package Searching;

import java.util.*;



public class Linear_S
{
    
    public static int LS(int arr[],int j)
    {   
        
        int i=0;
        
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==j)
            {
                break;                
            }
            
        }
        
        return i;
        
    }

    public static int[] create_Arr()
    {
        Scanner in = new Scanner(System.in);
        int z;
        System.out.println("Enter the is size of the array: ");
        z=in.nextInt();
        int arr[];
        arr=new int[z];

        for(int i=0;i<z;i++)
        {
            System.out.println("Enter an element: ");
            arr[i]=in.nextInt();
        }
        
        return arr;
        
    }
    
    public static void main(String[] args) {
        
        Scanner into = new Scanner(System.in);
        
        int[] arr;
        arr=create_Arr();
        
        System.out.println("Enter the Value to Search: ");
        int key;
        key=into.nextInt();
       
        int x;
        x=LS(arr,key);
        System.out.println("The element was found at: "+x+1);
        into.close();
    
    }
}
