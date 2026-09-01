import java.io.*;
import java.util.*;
public class array2
{
 public static void main(String[] args)
 {

  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of elements:");
  int n=sc.nextInt();
  int marks[]=new int[n];
  for(int i=0;i<n;i++)
  {
   marks[i]=sc.nextInt();
  }
  System.out.println("\nelements are");
  for(int i=0;i<n;i++)
  {
   System.out.println(marks[i]);
  }
  
 }
}