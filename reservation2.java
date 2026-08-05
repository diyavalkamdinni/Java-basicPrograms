import java.io.*;
import java.util.*;
public class reservation2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Guest Name:");
  String name=sc.nextLine();
  System.out.println("Enter Room Number:");
  int room=sc.nextInt();
  System.out.println("Enter Room Rent:");
  double rent=sc.nextDouble();
  System.out.println("Enter Room type:");
  char type=sc.next().charAt(0);
  System.out.println("----Hotel Reservation----");
  System.out.println("Guest Name:"+name+"\nRoom Number:"+room+"\nRoom rent:"+rent+"\nRoom type:"+type);
 }
}