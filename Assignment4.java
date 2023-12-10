/*Given two integers a and n. The task is to find the sum of the
series 1/a + 2/a^2 + 3/a^3 + ... + n/a^n
*/

import java.util.*;
public class Assignment4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the no. n & a:");
        double n = sc.nextInt();
        double a = sc.nextInt();
        double sum = 0.0;
        for(double i=1.0;i<=n ; i++)
        {
            //System.out.println(i+"++");        /// 1,2,3,4
            sum =sum + (i /Math.pow(a,i));
            
        }
        System.out.println("sum of the series :"+sum);

    }
}