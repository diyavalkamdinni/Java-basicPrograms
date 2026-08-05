import java.io.*;
import java.util.*;

public class booknames 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String books[] = new String[6];

        System.out.println("Enter 6 book names:");

        for(int i = 0; i < 6; i++) {
            books[i] = sc.next();
        }

        System.out.println("Book Names:");

        for(String book : books) {
            System.out.println(book);
        }
    }
}