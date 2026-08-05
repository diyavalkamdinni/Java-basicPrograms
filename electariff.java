import java.io.*;
import java.util.*;

public class electariff 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly power consumption (units): ");
        int units = sc.nextInt();

        if (units <= 100) {
            System.out.println("Domestic Tariff");
        } else if (units <= 500) {
            System.out.println("Commercial Tariff");
        } else {
            System.out.println("Industrial Tariff");
        }
    }
}