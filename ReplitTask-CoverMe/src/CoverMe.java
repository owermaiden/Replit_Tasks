import java.util.Scanner;

public class CoverMe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here

        if (!main.contains(coverME)){
            return "["+main+"]";
        }

        return main.replace(coverME, "["+coverME+"]");

    }
}
