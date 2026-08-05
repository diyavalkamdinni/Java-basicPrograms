import java.io.*;
import java.util.*;
public class foreach2
{
 public static void main(String[] args)
 {
  ArrayList <Integer> marks=new ArrayList<>();
  marks.add(75);
  marks.add(100);
  marks.add(50);
  marks.add(25);
  System.out.println(marks);
  for (int card:marks)
  {
   System.out.println(card);
  }
 }
}