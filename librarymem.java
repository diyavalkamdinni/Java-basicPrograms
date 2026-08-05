import java.io.*;
import java.util.*;

public class librarymem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        if(attendance >= 75)
            System.out.println("Eligible for library membership");
    }
}