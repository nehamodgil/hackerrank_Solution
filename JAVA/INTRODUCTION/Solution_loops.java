import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_loops {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int result;
    for(int i=1;i<=10;i++)
    {
      result = N * i;
      System.out.println(N + " x " + i +" = " +result);
    }

  }
}
