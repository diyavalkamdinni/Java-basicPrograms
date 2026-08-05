import java.io.*;
import java.util.*;

public class primenumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i, count = 0;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }

        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}