import java.io.*;
import java.util.*;

public class smartparking 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle height (in meters): ");
        double height = sc.nextDouble();

        if (height <= 2.5) 
        {
            System.out.println("Vehicle is allowed to enter.");
        }
       
    }
}