import java.io.*;
import java.util.*;

public class empsalary 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int salary[] = new int[5];

        System.out.println("Enter 5 salaries:");

        for(int i = 0; i < 5; i++) {
            salary[i] = sc.nextInt();
        }

        System.out.println("Employee Salaries:");

        for(int s : salary) {
            System.out.println(s);
        }
    }
}