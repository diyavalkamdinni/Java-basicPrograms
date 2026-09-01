import java.io.*;
import java.util.*;
public class passobj
{
 String name;
 passobj(String name){
 this.name=name;
 }
 void display(passobj s){System.out.println("name:"+s.name);}
 public static void main(String[] args)
 {
  passobj obj1=new passobj("diya");
  obj1.display(obj1);
 
 }
}