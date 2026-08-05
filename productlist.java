import java.io.*;
import java.util.*;

public class productlist 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();

        System.out.println("Enter 5 product names:");

        for(int i = 0; i < 5; i++) {
            products.add(sc.next());
        }

        products.remove(1);

        System.out.println("Products after removing index 1:");

        for(String p : products) {
            System.out.println(p);
        }
    }
}