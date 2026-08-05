import java.io.*;
import java.util.*;

public class deliverystatus 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order Amount: ");
        int amount = sc.nextInt();

        String status = (amount >= 500) ? "Free Delivery" : "Delivery Charged";

        System.out.println(status);
    }
}