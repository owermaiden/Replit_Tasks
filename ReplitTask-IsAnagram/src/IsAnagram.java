import java.util.HashMap;
import java.util.LinkedHashMap;

public class IsAnagram {
    public static void main(String[] args) {
        String word1 = "Mark";
        String word2 = "Ramk";
        System.out.println(isAnagram(word1,word2));

    }
    public static boolean isAnagram(String str1, String str2){
        String word1 = str1.toLowerCase();
        String word2 = str2.toLowerCase();
        HashMap<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : word1.toCharArray()){
            int count = map.getOrDefault(ch,0);
            map.put(ch, count + 1);
        }

        for (char ch : word2.toCharArray()){
            map.remove(ch);
        }

        return map.isEmpty();
    }
}
