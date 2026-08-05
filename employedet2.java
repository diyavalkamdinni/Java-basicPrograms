import java.io.*;
import java.util.*;
public class employedet2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Employee Name:");
  String name=sc.nextLine();
  System.out.println("Enter Employee ID:");
  int id=sc.nextInt();
  System.out.println("Enter Monthly salary:");
  double sal=sc.nextDouble();
  System.out.println("Enter Department code:");
  char code=sc.next().charAt(0);
  System.out.println("----Employee Details----");
  System.out.println("Employee Name:"+name+"\nEmployee ID:"+id+"\nMonthly Salary:"+sal+"\nDepartement code:"+code);
 }
}