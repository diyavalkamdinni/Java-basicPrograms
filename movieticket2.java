import java.io.*;
import java.util.*;
public class movieticket2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Customer name:");
  String name=sc.nextLine();
  System.out.println("Enter Number of Tickets:");
  int ticket=sc.nextInt();
  System.out.println("Enter Total amount:");
  double amount=sc.nextDouble();
  System.out.println("Enter Seat type:");
  char seat=sc.next().charAt(0);
  System.out.println("----Booking Details----");
  System.out.println("Customer Name:"+name+"\nTickets:"+ticket+"\nTotal Amount:"+amount+"\nSeat type:"+seat);
 }
}