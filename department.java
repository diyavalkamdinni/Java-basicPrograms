import java.io.*;
import java.util.*;


public class department
{ 
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter department code (1-5): ");
        int code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("CSE");
                break;

            case 2:
                System.out.println("ECE");
                break;

            case 3:
                System.out.println("EEE");
                break;

            case 4:
                System.out.println("Mechanical");
                break;

            case 5:
                System.out.println("Civil");
                break;

            default:
                System.out.println("Invalid Department Code");
        }
    }
}