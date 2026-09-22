import java.io.*;
import java.util.*;
public class jarray2
{
 public static void main(String[] args)
 {
  Scanner sc =new Scanner(System.in);
  int age[][]=new int[4][];
  age[0]=new int[2];
  age[1]=new int[1];
  age[2]=new int[3];
  age[3]=new int[2];
  System.out.println("Enter 8 ages");
  for(int i=0;i<age.length;i++)
  {
   for(int j=0;j<age[i].length;j++)
   {
    age[i][j]=sc.nextInt();
   }
  }
  System.out.println("Display ages");
  for(int i=0;i<age.length;i++)
  {
   for(int j=0;j<age[i].length;j++)
   {
    System.out.print(age[i][j]+" ");
   }
   System.out.println();
  }
 }
}