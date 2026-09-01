import java.io.*;
import java.util.*;
public class cmdline3
{
 public static void main(String[] args)
 {
  int a=Integer.parseInt(args[0]);
  double b=Double.parseDouble(args[1]);
  double c=Double.parseDouble(args[2]);
  double avg=(a+b+c)/3;
  System.out.println("avg:"+avg);

 }
}