import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        String x = "11:45:00 PM";
        timeConversion(x);
    }

    public static void timeConversion(String str)
    {
        // Get hours
        int h1 = (int)str.charAt(1) - '0';
        int h2 = (int)str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        // If time is in "AM"
        if (str.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }

        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
    }

}
