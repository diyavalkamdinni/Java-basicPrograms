import java.io.*;
import java.util.*;
public class Scholarship 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter Sports Marks: ");
        int sports = sc.nextInt();
        if (marks > 90)
        {
            System.out.println("Scholarship Granted");
        }
        else if (marks >= 80 && sports == 80)
        {
            System.out.println("Scholarship Granted");
        }
        else if (marks >= 70 || sports == 95) 
        {
            System.out.println("Scholarship Granted");
        }
        else 
        {
            System.out.println("No Scholarship");
        }
    }
}


