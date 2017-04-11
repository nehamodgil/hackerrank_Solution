import java.util.Scanner;
import java.util.regex.*;

public class Solution_pattern_syntax
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    boolean flag = false;
    while(testCases>0)
    {
      String input = in.nextLine();
      try
      {
        Pattern.compile(input);
        System.out.println("Valid");
      }
      catch (PatternSyntaxException exception)
      {
        System.out.println("Invalid");
      }
    }
  }
}
