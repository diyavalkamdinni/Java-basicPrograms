
import java.io.*;
import java.util.*;

public class passwordlogin 
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);

        String password = "java";
        int attempts = 0;

        while (attempts < 3) 
        {
            System.out.println("Enter password:");
            String input = sc.nextLine();

            if (input.equals(password)) 
            {
                System.out.println("Login Successful");
                return;
            }

            attempts++;
            System.out.println("Incorrect Password");
        }

        System.out.println("Maximum attempts reached.");
    }
}
