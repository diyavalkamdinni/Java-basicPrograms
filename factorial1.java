import java.io.*;
import java.util.*;

public class factorial1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int fact = 1;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}