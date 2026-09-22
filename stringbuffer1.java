import java.io.*;
import java.util.*;

public class stringbuffer1
{
 public static void main(String[] args)
 {
  StringBuffer n1 = new StringBuffer("Gitam university");
  System.out.println("first string:" + n1);
  StringBuffer n2 = new StringBuffer();
  System.out.println("second string:" + n2);
  System.out.println("length: " + n1.length());
  System.out.println("capacity: " + n1.capacity());
  n1.ensureCapacity(50);
  System.out.println("Capacity: " + n1.capacity());
  StringBuffer n3 = new StringBuffer("Hello World");
  n3.setLength(5);
  System.out.println(n3);
  StringBuffer n4 = new StringBuffer("diya");
  System.out.println(n4.charAt(2));
  n4.setCharAt(0,'s');
  System.out.println(n4);
  
  }
 }
}

