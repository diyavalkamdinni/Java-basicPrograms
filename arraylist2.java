import java.io.*;
import java.util.*;
public class arraylist2
{
 public static void main(String[] args)
 {
  ArrayList<Integer> marks=new ArrayList<>();
  marks.add(50);
  marks.add(80);
  marks.add(10);
  marks.add(90);
  System.out.println(marks);
  marks.remove(2);
  System.out.println(marks);
  marks.add(0,100);
  System.out.println(marks);
  System.out.println(marks.size());
 }
}