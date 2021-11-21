import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        String word = "aaaabbbccc";
        System.out.println(countLetters(word));

    }

    public static String countLetters(String word){
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (char ch : word.toCharArray()){
                int count = map.getOrDefault(ch,0);
                map.put(ch, count + 1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            result.append(entry.getValue());
            result.append(entry.getKey());
        }

        return result.toString();
    }
}
