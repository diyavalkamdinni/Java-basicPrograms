import java.io.*;
import java.util.*;

public class sumofdigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, rem, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n != 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        System.out.println("Sum of Digits = " + sum);
    }
}