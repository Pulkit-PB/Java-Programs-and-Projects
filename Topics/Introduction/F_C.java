package Introduction;
import java.util.Scanner;
public class F_C{

    static Float toC(Float f){
        Float c;
        c=(f-32)*5/9;
        return c;        
    }

    static Float toF(Float c){
        Float f;
        f=c*9/5+32;
        return f;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int m=1;
        while(m==1){

            System.out.println("\nChoose the operation:\n\t1.Celsius to Fahrenheit\n\t2.Fahrenheit to Celsius\n\t3.Exit");
            int ch;
            ch=in.nextInt();

            if(ch==1||ch==2)
            {
                //Taking input for the temperature
                System.out.println("\nEnter your temperature:");
                Float T;
                T=in.nextFloat();

                //Using If condtions to convert from C to F OR F to C
                if(ch==1)
                {
                    Float f=toF(T);
                    System.out.println("\nThe given temperature in fahrenheit is : "+f);
                }

                else if(ch==2)
                {
                    Float c=toC(T);
                    System.out.println("\nThe given temperature in celsius is : "+c);
                }
            }
            
            else
            {
                m=0;
            }
            
            
            
        }

        in.close();
        
    }
}
    

