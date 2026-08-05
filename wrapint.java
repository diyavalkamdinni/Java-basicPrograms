import java.io.*;
import java.util.*;

public class wrapint 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");

        String balance = sc.next();

        int bal = Integer.parseInt(balance);

        System.out.println("Balance = " + bal);
    }
}