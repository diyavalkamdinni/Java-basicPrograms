import java.io.*;
import java.util.*;
public class oddeven2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number:");
  int num=sc.nextInt();
  if(num%2==0)
  {
   System.out.println("is even");
  }
  else 
   System.out.println("is odd");
 }
}