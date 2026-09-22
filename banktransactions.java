import java.io.*;
import java.util.*;

public class banktransactions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int transactions[] = new int[n];

        int total = 0;

        System.out.println("Enter number of transactions for each day:");

        for(int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
            total = total + transactions[i];
        }

        double average = (double) total / n;

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(transactions[i] > average) {
                count++;
            }
        }

        int max = transactions[0];
        int maxday = 1;

        for(int i = 1; i < n; i++) {
            if(transactions[i] > max) {
                max = transactions[i];
                maxday = i + 1;
            }
        }

        System.out.println("Average transactions = " + average);
        System.out.println("Days above average = " + count);
        System.out.println("Day with maximum transactions = Day " + maxday);
        System.out.println("Maximum transactions = " + max);
    }
}