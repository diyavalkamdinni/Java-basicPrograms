import java.io.*;
import java.util.*;
public class overload3
{
 void display(String name){System.out.println(name);}
 void display(String name,int age){System.out.println(name+"\t"+age);}
 void display(String name,char grade){System.out.println(name+"\t"+grade);}

 public static void main(String[] args)
 {
  overload3 obj1=new overload3();
  obj1.display("diya");
  obj1.display("diya",19);
  obj1.display("diya",'A');

 }
}