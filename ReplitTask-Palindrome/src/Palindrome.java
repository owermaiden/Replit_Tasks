public class Palindrome {
    public static void main(String[] args) {
        String word = "Race car";
        System.out.println(isPalindrome(word));
    }
    public static boolean isPalindrome(String word){

        String str = word.toLowerCase();
        str = str.replace(" ", "");
        for(int i=0; i < str.length()/2; i++) {

            if(str.charAt(i) != str.charAt(str.length()-1 - i)) {
                return false;
            }

        }
        return true;
    }
}
