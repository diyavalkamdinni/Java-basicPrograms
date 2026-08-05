import java.io.*;
import java.util.*;

public class overload2
{
    void area(int r)
    {
        System.out.println("circle=" + (3.14 * r * r));
    }

    void area(double s)
    {
        System.out.println("square=" + (s * s));
    }

    void area(int l, int b)
    {
        System.out.println("rectangle=" + (l * b));
    }

    void area(double b, int h)
    {
        System.out.println("parallelogram=" + (b * h));
    }

    public static void main(String[] args)
    {
        overload2 obj1 = new overload2();

        obj1.area(8);
        obj1.area(4.1);
        obj1.area(6, 7);
        obj1.area(9.2, 8);
    }
}