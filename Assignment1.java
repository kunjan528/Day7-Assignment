//sin x = x - x^3/3! + x^5/5! - x^7/7! + x^9/9! .......

import java.util.*;
public class Assignment1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter the Degree:");
        double degree = sc.nextDouble();
        //30Deg × π/180 
        double radian = degree * Math.PI / 180.0 ;
        System.out.println("Radian :"+radian);
        System.out.print("Enter the number(N):");
        double n = sc.nextInt();
        double i ;
        double fact = 1.0;
        double sum = 0.0;
        double m = 1.0;
        for(i= 1.0;i<=n;i++ )
        {
           //  System.out.println("***"+i);
           fact = fact * i;
           if(i % 2.0 != 0)
           {
            sum = sum + m* (Math.pow(radian , i)/fact);
             m = 1.0 * m;
           }
           
           
        }
        
        System.out.printf("Sum Of The Sreries :%.2f" , sum);

    }
}