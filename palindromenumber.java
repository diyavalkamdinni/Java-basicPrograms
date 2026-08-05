import java.io.*;
import java.util.*;

public class palindromenumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, temp, rem, rev = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while(n != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}