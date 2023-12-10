//Find the sum of the series 1 + 1/(2*2)+1/(3 * 3)+1/(4*4)+....+1/(n*n))
import java.util.Scanner;
public class Assignment5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N:");
        int n= sc.nextInt();
        double  sum = 0.0 ;
        double i ;
        for(i = 1 ; i<= n ; i++)
        {
             sum = sum +1/(i*i);
        }
        System.out.print("The sum of the series is :"+sum);
    }
}