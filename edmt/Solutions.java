package edmt;
import java.util.Scanner;

//Every line of input will contain a String followed by an integer.
//Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
public class Solutions {

    public static void main(String[] args) 
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int l = s1.length();
                int x=sc.nextInt();
                if(x/1==0)
                {
                   System.out.print(s1);
                    for(int j=l; j<15;j++)
                    {
                       System.out.print(" ");
                    }
                   System.out.println("000");
                }
                else if(x/10==0)
                {
                   System.out.print(s1);
                    for(int j=l; j<15;j++)
                    {
                       System.out.print(" ");
                    }
                   System.out.println("00"+x);
                }
                else if(x/100==0)
                {
                   System.out.print(s1);
                    for(int j=l; j<15;j++)
                    {
                       System.out.print(" ");
                    }
                   System.out.println("0"+x);
                }
                else
                {
                    System.out.print(s1);
                    for(int j=l; j<15;j++)
                    {
                       System.out.print(" ");
                    }
                   System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}



