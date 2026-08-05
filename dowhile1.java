import java.io.*;
import java.util.*;
public class dowhile1
{
 public static void main(String[] args)
 {
  int attempt=1;
  do{
     System.out.println("password attempt:"+attempt);
     attempt++;
    }while(attempt<=3);
  System.out.println("Maximum attempts reached");
 }
}