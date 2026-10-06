import java.io.*;
import java.util.*;

public class studentdetailsrec
{
    String name;
    int age;

    studentdetailsrec()
    {
        name = "Tom";
        age = 20;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args)
    {
        studentdetailsrec s = new studentdetailsrec();

        s.display();
    }
}