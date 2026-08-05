import java.io.*;
import java.util.*;
public class patient2
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Patient name:");
  String name=sc.nextLine();
  System.out.println("Enter Age:");
  int age=sc.nextInt();
  System.out.println("Enter consultation fee:");
  double fee=sc.nextDouble();
  System.out.println("Enter blood group:");
  char group=sc.next().charAt(0);
  System.out.println("---Patient Details---");
  System.out.println("\nPatient name:"+name+"\nAge:"+age+"\nConsultation fee:"+fee+"\nBlood group:"+group);
 }
}