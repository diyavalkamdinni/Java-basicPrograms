import java.io.*;
import java.util.*;

public class studentdetails
{
    String name;
    int age;

    studentdetails(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args)
    {
        studentdetails s = new studentdetails("Tom", 18);

        s.display();
    }
}