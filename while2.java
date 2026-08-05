import java.io.*;
import java.util.*;
public class while2
{
 public static void main(String[] args)
 {
  int balance=2000;
  int withdraw=600;
  while(balance>withdraw)
  {
   balance=balance-withdraw;
   System.out.println(balance);
  }
 }
}