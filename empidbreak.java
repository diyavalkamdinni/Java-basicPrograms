import java.io.*;
import java.util.*;

public class empidbreak 
{
    public static void main(String[] args) 
    {

        for (int id = 1; id <= 100; id++) {

            if (id == 50) {
                break;
            }

            System.out.println("Employee ID: " + id);
        }
    }
}