import java.io.*;
import java.util.*;

public class varargsum
{
    static int sum(int... numbers)
    {
        int total = 0;

        for(int n : numbers)
        {
            total = total + n;
        }

        return total;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum = " + sum(10, 20, 30, 40));
    }
}