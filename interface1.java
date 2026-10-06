import java.io.*;
import java.util.*;
interface payment
{
 double charge=2.5;
 void pay();
}
class creditcard implements payment
{
 public void pay()
 {
  System.out.println("payment:"+charge+"%");
 }
}
public class interface1
{
 public static void main()
 {
  creditcard c = new creditcard();
  c.pay();

 }
}