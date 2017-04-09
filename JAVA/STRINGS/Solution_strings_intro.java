import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();

    //SUM OF LENGTHS
    System.out.println (A.length() + B.length());

    //COMPARING THE TWO STRINGS
    int i = A.compareTo(B);
    if(i>0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }

    //CONCATENATION OF TWO STRINGS
    A = A.substring(0, 1).toUpperCase() + A.substring(1);
    B = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(A+ " " + B);

  }
}
