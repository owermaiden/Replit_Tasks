import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars("erer"));
    }

    public static String uniqueChars(String str) {

        Set<String> set = new LinkedHashSet<>();
        for (String s : str.split("")){
            set.add(s);
        }

        String x = Stream.of(str.toCharArray())
                            // Do whatever you want...
                            // filter , sort, map etc...
                            .map(String::valueOf)
                            .collect(Collectors.joining());
        return x;
    }
}
