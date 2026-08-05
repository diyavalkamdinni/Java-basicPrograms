
import java.io.*;
import java.util.*;

public class user6
{
    double display(int a, double b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        user6 obj1 = new user6();

        double sum = obj1.display(10, 50.5, 10);

        System.out.println(sum);
    }
}

