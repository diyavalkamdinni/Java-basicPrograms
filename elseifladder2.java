import java.io.*;
import java.util.*;
public class elseifladder2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter marks:");
  int marks=sc.nextInt();
  System.out.println("enter Attendence");
  int att=sc.nextInt();
  if((marks>90) &&(att>=90)){System.out.println("A");}
  else if((marks>75) &&(att>=75)){System.out.println("B");}
  else if((marks>65) &&(att>=65)){System.out.println("C");}
  else if((marks>25)&&(att>25)){System.out.println("D");}
  else{System.out.println("fail");}
 }
}