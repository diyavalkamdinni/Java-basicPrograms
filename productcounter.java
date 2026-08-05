import java.io.*;
import java.util.*;

public class productcounter 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target product count: ");
        int target = sc.nextInt();

        int count = 0;

        while (count < target) {
            count++;
            System.out.println("Scanned Product " + count);
        }

        System.out.println("Target reached.");
    }
}