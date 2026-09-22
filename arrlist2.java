import java.io.*;
import java.util.*;

public class arrlist2
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add(2, "cherry");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Pineapple");
        list1.add("Strawberry");
        list1.add("mango");

        // addAll method
        list.addAll(list1);

        // get method
        System.out.println("Element: " + list.get(2));

        // set method
        list.set(1, "blueberry");

        // remove index
        list.remove(1);

        // remove object
        list.remove("banana");

        // size method
        System.out.println("Size: " + list.size());

        // contains method
        System.out.println("Contains banana: " + list.contains("banana"));

        // containsAll method
        System.out.println("Contains all: " + list.containsAll(list1));

        // isEmpty method
        System.out.println("Is empty: " + list.isEmpty());

        // indexOf method
        System.out.println("Index: " + list.indexOf("mango"));

        // lastIndexOf method
        System.out.println("Last Index: " + list.lastIndexOf("mango"));

        // removeAll method
        list.removeAll(list1);
        System.out.println("After removeAll: " + list);

        
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("mango");

        // retainAll method
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("mango");
        list2.add("apple");

        list.retainAll(list2);
        System.out.println("After retainAll: " + list);

        // add elements again
        list.add("banana");
        list.add("cherry");
        list.add("apple");

        // removeIf method
        list.removeIf(x -> x.equals("apple"));
        System.out.println("After removeIf: " + list);

        // sort method
        list.sort(null);
        System.out.println("Sorted list: " + list);

        // clear method
        list.clear();
        System.out.println("After clear: " + list);

        System.out.println("Added list = " + list);
    }
}