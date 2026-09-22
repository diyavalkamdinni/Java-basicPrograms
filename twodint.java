import java.io.*;
import java.util.*;

public class twodint
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);

  int num[][]=new int[3][4];

  System.out.println("Enter  integers:");

  for(int i=0;i<num.length;i++)
  {
   for(int j=0;j<num[i].length;j++)
   {
    num[i][j]=sc.nextInt();
   }
  }

  System.out.println("Elements in the array are:");

  for(int i=0;i<num.length;i++)
  {
   for(int j=0;j<num[i].length;j++)
   {
    System.out.print(num[i][j]+"\t");
   }
   System.out.println();
  }
 }
}