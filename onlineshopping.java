import java.io.*;
import java.util.*;

public class onlineshopping 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String choice;
        int count = 0;

        do {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            count++;

            System.out.print("Add another product? (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Total products added: " + count);
    }
}