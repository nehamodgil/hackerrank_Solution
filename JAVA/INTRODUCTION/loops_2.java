import java.util.*;
import java.io.*;

class Solution_loops_2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int j;
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int value = 0;
            for (j=0;j<n;j++)
            {
                int result = value + ((int)Math.pow(2, j) * b);
                System.out.print((result + a) + " ");
                value = result;
            }
           System.out.println();
        }
        in.close();
    }
}
