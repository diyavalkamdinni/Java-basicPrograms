import java.io.*;
import java.util.*;

public class atmmenu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nATM MENU");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance Selected");
                    break;

                case 2:
                    System.out.println("Deposit Selected");
                    break;

                case 3:
                    System.out.println("Withdraw Selected");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}