import java.io.*;
import java.util.*;
public class lock
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int print=23;
  System.out.println("enter pin:");
  int get=sc.nextInt();
  if(get==print)
   System.out.println("Unlocked");
  else 
   System.out.println("try again");
  
 }
}