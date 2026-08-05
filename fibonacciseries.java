import java.io.*;
import java.util.*;

public class fibonacciseries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, c, i;

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        if(n >= 1)
            System.out.print(a + " ");

        if(n >= 2)
            System.out.print(b + " ");

        for(i = 3; i <= n; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}