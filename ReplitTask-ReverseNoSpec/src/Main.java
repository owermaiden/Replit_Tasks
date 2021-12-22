import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "c,b$a";

        // ed,c,bA!$   ed,cbA!$
        System.out.println("result is " + reverseNoSpec(str));
    }

    public static String reverseNoSpec(String str) {

        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))){
                stack.push(str.charAt(i));
            } else {
                list.add(str.charAt(i));
                indexList.add(i);
            }

        }

        for (int i = 0; i < str.length(); i++) {

            if (!list.isEmpty() && indexList.get(0) == i) {
                result.append(list.get(0));
                indexList.remove(0);
                list.remove(0);
                continue;
            }
            if (!stack.isEmpty()) result.append(stack.pop());

        }

        return result.toString();
    }
}
