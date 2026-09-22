import java.io.*;
import java.util.*;
public class string1
{
 public static void main(String[] args)
 {
  String n1="Gitam university";
  String n2="bengaluru";
  System.out.println("first string:"+n1);
  String str1 = new String(); 
  String str2 = new String("Diya"); 
  System.out.println("s1: " + str1); 
  System.out.println("s2: " + str2);
  System.out.println("size of n1:"+n1.length());
  String concat=str2+n2;
  System.out.println("concatenation:"+concat);
  Integer a=25;
  String s = a.toString(); 
  System.out.println(s);
  char ch = n1.charAt(3); 
  System.out.println("character: " + ch);
  if (n1.equals(n2)) 
  { System.out.println("equal"); } 
  else 
  { System.out.println("not equal");}
  int pos = n2.indexOf("l");
  String news = s.replace("i", "u");
  System.out.println(news);
  String n3=" GITAM UNIVERSITY ";
  String res = n3.trim(); 
  System.out.println(res); 
  String num="25";
  int n=Integer.parseInt(num);
  System.out.println(n);
  System.out.println("lowercase is:"+n3.toLowerCase());
  System.out.println("uppercase is:"+n3.toUpperCase());
  String result=String.join(";","gitam","university");
  System.out.println(result);
  String name="diya,gitam,sem3";
  String profile[]=name.split(",");
  for(String names:profile)
  {System.out.println(names);}
  
 }
}