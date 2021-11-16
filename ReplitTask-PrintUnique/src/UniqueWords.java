import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {

    public static void main(String[] args) {

        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};


        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        HashMap<String, Boolean> map = new LinkedHashMap<>();
        int n = words.length;
        Arrays.sort(words);

        for (int i = 0; i < n - 1; i++){

            if (words[i].equals(words[i + 1])){

                while (words[i].equals(words[i + 1])){

                    if (i == n - 2){

                        map.put(words[++i],false);
                        break;

                    } else {

                        map.put(words[i++],false);
                    }

                }

            } else {

                map.put(words[i], true);

            }
        }

        if (!map.containsKey(words[n-1])) map.put(words[n-1], true);

        map.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
