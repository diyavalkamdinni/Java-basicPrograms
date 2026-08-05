import java.io.*;
import java.util.*;

public class bookids 
{
    public static void main(String[] args)
    {

        for (int id = 101; id <= 120; id++) {

            if (id == 110) {
                break;
            }

            System.out.println("Book ID: " + id);
        }
    }
}