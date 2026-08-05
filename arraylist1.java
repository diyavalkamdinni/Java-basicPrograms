import java.io.*;
import java.util.*;
public class arraylist1
{
 public static void main(String[] args)
 {
  ArrayList<String> fruit=new ArrayList<>();
  fruit.add("apple");
  fruit.add("kiwi");
  fruit.add("mango");
  fruit.add("orange");
  System.out.println(fruit);
  System.out.println(fruit.size());
  fruit.remove(2);
  System.out.println(fruit);
  fruit.add(2,"banana");
  System.out.println(fruit);
 }
}