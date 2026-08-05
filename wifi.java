import java.io.*;
import java.util.*;
public class wifi
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter speed:");
  int speed=sc.nextInt();
  if(speed>50)
   System.out.println("Basic");
  else if(speed>85)
   System.out.println("Standard");
  else if(speed>900)
   System.out.println("Premium");
  else if(speed >1000)
   System.out.println("Ultra");
  else 
   System.out.println("invalid"); 
  
 }
}