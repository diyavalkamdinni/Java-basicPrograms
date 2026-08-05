import java.io.*;
import java.util.*;
public class bookpurchase2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Book Title:");
  String book=sc.nextLine();
  System.out.println("Enter Quantity:");
  int qua=sc.nextInt();
  System.out.println("Enter Price:");
  double price=sc.nextDouble();
  System.out.println("Enter Category:");
  char category=sc.next().charAt(0);
  System.out.println("----Book Purcahse Details----");
  System.out.println("Book Title:"+book+"\nQuantity:"+qua+"\nPrice:"+price+"\nCategory:"+category);
 }
}