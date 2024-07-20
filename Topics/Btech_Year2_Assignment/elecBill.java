package Btech_Year2_Assignment;
import java.util.Scanner;

class Electric {

    Scanner in = new Scanner(System.in);

    Long Con_No;
    String Con_Name;
    Float read_prev;
    Float read_curr;
    int EBcon;

    public void getdata()
    {
        System.out.println("Enter the Consumer No. :");
        Con_No=in.nextLong();
        System.out.println("Enter the Consumer Name :");
        Con_Name=in.next();
        System.out.println("Enter the Previous Month reading :");
        read_prev=in.nextFloat();
        System.out.println("Enter the Current Month reading :");
        read_curr=in.nextFloat();
        System.out.println("Enter the EB connection type :");
        EBcon=in.nextInt();
        
        
    }

    
    Float bill;
    

    public void billCalc()
    {
        Float read=read_curr-read_prev;
        bill=0f;
        if(EBcon==1)
        {
            if(read<=100)
            {
                bill+=read*1;
            }
            else if(read>100 && read<=200)
            {
                bill+=100+((read-100)*2.50f);
            }
            else if(read>200 && read<500)
            {
                bill+=100+(100*2.5f)+((read-100)*4);
            }
            else if(read>500)
            {
                bill+=100+(100*2.5f)+(300*4)+((read-500)*6);
            }
         
        }

        else if(EBcon==2)
        {
            if(read<=100)
            {
                bill+=read*2;
            }
            else if(read>100 && read<=200)
            {
                bill+=200+((read-100)*4.50f);
            }
            else if(read>200 && read<500)
            {
                bill+=200+(100*4.5f)+((read-100)*6);
            }
            else if(read>500)
            {
                bill+=200+(100*4.5f)+(300*6)+((read-500)*7);
            }
 
        }

        else{
            System.out.printf("Wrong connection type");
        }
    }
    
    public void display()
    {
        
        System.out.println("The Bill :\n"+Con_No+"\t"+Con_Name+"\t"+bill);
    }
}


public class elecBill{

    public static void main(String[] args) {

        Electric obj = new Electric();
        obj.getdata();
        obj.billCalc();
        obj.display();
        
    }

}
