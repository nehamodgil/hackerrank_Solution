import java.util.*;
import java.text.*;

public class Solution_currency {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","in"));

        String us = usFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        String india = indiaFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
