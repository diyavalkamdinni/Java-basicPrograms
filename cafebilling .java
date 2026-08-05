import java.io.*;
import java.util.*;

public class cafebilling 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Coffee - ₹50");
        System.out.println("2. Tea - ₹30");
        System.out.println("3. Sandwich - ₹80");
        System.out.println("4. Burger - ₹120");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Coffee Bill = ₹50");
                break;
            case 2:
                System.out.println("Tea Bill = ₹30");
                break;
            case 3:
                System.out.println("Sandwich Bill = ₹80");
                break;
            case 4:
                System.out.println("Burger Bill = ₹120");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}