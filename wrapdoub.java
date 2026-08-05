import java.io.*;
import java.util.*;

public class wrapdoub 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature: ");

        String temp = sc.next();

        double temperature = Double.parseDouble(temp);

        System.out.println("Temperature = " + temperature);
    }
}