import java.io.*;
import java.util.*;

public class freedelivery 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ₹");
        double amount = sc.nextDouble();

        if (amount >= 1000) {
            System.out.println("Eligible for FREE Home Delivery.");
        } else {
            System.out.println("Not Eligible for FREE Home Delivery.");
        }
    }
}