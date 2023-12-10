//3) Find the sum of the series 1/1! + 2/2! + 3/3! + ... + n/n!

import java.util.*;
public class Assignment3
{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num :");

       double num = sc.nextInt();
       double i = 5;
       double fact =1;
       double sum = 0;
       for(i = 1 ; i<=num ;i++)
       {
           
            fact = fact * i;
             sum = sum + (i/fact);
            
            
       }
        System.out.print("Output :"+sum);
    }
}