import java.io.*;
import java.util.*;

public class countdigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n != 0)
        {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);
    }
}