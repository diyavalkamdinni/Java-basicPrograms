import java.io.*;
import java.util.*;

public class positivenegative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0)
            System.out.println("Positive Number");
        else if(n < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}