import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_string_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int length = sc.nextInt();
        String min="";
        String max="";
        for(int i = 0;i<=S.length()-length;i++)
        {
            String s = S.substring(i,i+length);
            if(i == 0)
            {
                min = s;
            }
            if(s.compareTo(max)>0)
            {
                max = s;
            }
            else if(s.compareTo(min)<0)
            {
                min = s;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
