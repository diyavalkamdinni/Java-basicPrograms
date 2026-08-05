import java.io.*;
import java.util.*;

public class studentlist 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter 4 student names:");

        for(int i = 0; i < 4; i++) {
            students.add(sc.next());
        }

        System.out.println("Student Names:");
        for(String s : students) {
            System.out.println(s);
        }

        students.remove(2);

        System.out.println("After removing 3rd student:");
        System.out.println(students);

        System.out.println("Size = " + students.size());
    }
}