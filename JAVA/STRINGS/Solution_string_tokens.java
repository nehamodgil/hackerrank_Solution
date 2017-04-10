import java.io.*;
import java.util.*;

public class Solution_string_tokens {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    StringTokenizer S = new StringTokenizer(s," ',!?._@");
    System.out.println(S.countTokens());
    while (S.hasMoreTokens())
    {
      System.out.println(S.nextToken());
      scan.close();
    }
  }
}
