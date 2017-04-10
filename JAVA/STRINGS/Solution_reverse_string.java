import java.io.*;
import java.util.*;

public class Solution_reverse_string {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine();
    String reverse = new StringBuffer(A).reverse().toString();
    String A_reverse = reverse.toString();
    if(A.equalsIgnoreCase(A_reverse))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
    sc.close();

  }
}
