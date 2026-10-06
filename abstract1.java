import java.io.*;
import java.util.*;
abstract  class vehicle
{
 abstract void drive();
}
class car extends vehicle 
{    
 void drive() 
  {        
    System.out.println("Car is driving...");    
  } 
}
class bike extends vehicle
{
 void drive()
 {
  System.out.println("Bike is driving..");
 }
}
public class abstract1
{
 public static void main(String[] args) 
 {
   vehicle c=new car();
   c.drive();
   vehicle b=new bike();
   b.drive();
   
 }
}