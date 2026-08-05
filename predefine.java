import java.io.*;
import java.util.*;
import java.math.*;

public class predefine
{
    String name = "Ramu";

    void display()
    {
        System.out.println("java");
        System.out.println(Math.sqrt(64));
        System.out.println(Math.max(10, 25));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
    }

    public static void main(String[] args)
    {
        predefine obj1 = new predefine();
        obj1.display();
    }
}

