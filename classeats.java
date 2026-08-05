import java.io.*;
import java.util.*;

public class classeats 
{
    public static void main(String[] args) 
    {

        for (int seat = 1; seat <= 20; seat++) {

            if (seat == 2 || seat == 6 || seat == 9) {
                continue;
            }

            System.out.println("Seat Number: " + seat);
        }
    }
}