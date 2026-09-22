import java.io.*;
import java.util.*;
public class array6
{
 public static void main(String[] args)
 {

  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of elements:");
  int n=sc.nextInt();
  char grade[]=new char[n];
  for(int i=0;i<n;i++)
  {
   grade[i]=sc.next().charAt(0);
  }
  System.out.println("\nelements are");
  for(int i=0;i<n;i++)
  {
   System.out.println(grade[i]);
  }
  
 }
}