import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_end_of_file {

  public static void main(String[] args) {

    String s;
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    int i = 0;
    while(flag)
    {
      s=sc.nextLine();
      if(s.length()==0)
      {
        flag = false;
      }
      else
      {
        i++;
        System.out.println(i + " " + s);
      }
    }
  }
}
