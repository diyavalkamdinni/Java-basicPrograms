import java.io.*;
import java.util.*;
class student
{
  String name;
  int age;
  void study(){System.out.println("Btech");}
  void display(){System.out.println(name+age);}
}
public class studentmain
{
  public static void main(String[] args)
  {
    student obj1=new student();
    obj1.name="diya";
    obj1.age=19;
    obj1.study();
    obj1.display();
  }
}