import java.io.*;
import java.util.*;

public class employeeIDs 
{
    public static void main(String[] args) 
    {

        for (int id = 1; id <= 50; id++) {

            if (id == 5 || id == 10 || id == 15 || id == 25) {
                continue;
            }

            System.out.println("Employee ID: " + id);
        }
    }
}