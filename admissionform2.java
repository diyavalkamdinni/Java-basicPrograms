import java.io.*;
import java.util.*;
public class admissionform2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Student full name:");
  String name=sc.nextLine();
  System.out.println("Enter Roll number:");
  int roll=sc.nextInt();
  System.out.println("Enter cgpa:");
  double cgpa=sc.nextDouble();
  System.out.println("Enter Section:");
  char sec=sc.next().charAt(0);
  System.out.println("----Student Details----");
  System.out.println("Student Name:"+name+"\nRoll Number:"+roll+"\nCGPA:"+cgpa+"\nSection:"+sec);
 }
}