import java.util.HashMap;
import java.util.Scanner;


public class Reverse {
    public static String reverse(String input){
        StringBuilder newWord = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i-- ){
            newWord.append(input.charAt(i));
        }
        return  newWord.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
