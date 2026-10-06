import java.io.*;
import java.util.*;
class vehicle
{
 String brand;
 String colour;
 void display(){System.out.println("name:"+brand+"\t"+"colour:"+colour);}
 void start(){System.out.println("car starts");}
 void stop(){System.out.println("car stops");}
 
}
class car extends vehicle
{
 void noofdoors(){System.out.println("there are four doors");}
}
class electric extends car
{
 void charged(){System.out.println("the car is charged");}
}
public class multilevel2
{
 public static void main(String[] args)
 {
  electric obj=new electric();
  obj.brand="tesla";
  obj.colour="grey";
  obj.display();
  obj.start();
  obj.stop();
  obj.noofdoors();
  obj.charged();
 }
}