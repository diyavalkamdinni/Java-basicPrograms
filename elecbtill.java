import java.io.*;
import java.util.*;

public class elecbtill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter bill for month " + i + ": ");
            double bill = sc.nextDouble();
            total += bill;
        }

        System.out.println("Total electricity bill for 12 months = " + total);
    }
}