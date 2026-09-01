import java.io.*;
import java.util.*;
public class returnobj
{
 String name="Diya";
 returnobj getObject(){
 return this;
 }
 
 public static void main(String[] args)
 {
  returnobj obj1=new returnobj();
  returnobj obj2=obj1.getObject();
  System.out.println(obj2.name);
 }
}