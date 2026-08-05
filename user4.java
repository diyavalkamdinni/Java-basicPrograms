import java.io.*;
import java.util.*;
public class user4
{
    int display(int a,int b)
    {
     return a+b;
    }

    public static void main(String[] args)
    {
        user4 obj1=new user4();
        int sum=obj1.display(10,20);
        System.out.println("sum="+sum);
    }
}