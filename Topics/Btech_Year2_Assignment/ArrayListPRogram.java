package Btech_Year2_Assignment;
import java.util.*;

public class ArrayListPRogram {
 
    /*
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.contains(765432));
        System.out.println(list.contains(10));
        list.set(0,99);
        list.remove(2);
        //Input
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
        //get elements
        int element=list.get(0);
        System.out.println(element);
        //add elements in between
        list.add(1,15);
        System.out.println(list);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        // initialisation
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(in.nextInt());
            }
        }
        System.out.println(list1);
    }
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no. of elements for array:");
        int v = in.nextInt();

        int[] arr = new int[v];

        for(int i=0;i<v;i++)
        {
            System.out.println("Enter an element:");
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the value of N: ");
        int N=in.nextInt();
        
        System.out.println("The remaining array:");
        for(int i=N-1;i<v;i++)
        {
            System.out.println("=>"+arr[i]);
        }

        int[] newarr=new int[v];
        int index=0;

        //Finding unique digits
        for(int j=N-1;j<v;j++)
        {
            int f=0;
            for(int k=0;k<j;k++)
            {
                if(arr[j]==newarr[k])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                newarr[index]=arr[j];
                index++;
            }
        }

        System.out.println("The Unique elements in given array are:");
        for(int i=0;i<=index;i++)
        {
            System.out.println(newarr[i]);
        }

        in.close();

    }
    
}
