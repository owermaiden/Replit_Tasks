package com.cybertek;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String one = "abcde";
        String two = "12345";
        System.out.println(mergeWords(one,two));


    }
    public static String mergeWords(String one, String two){

        StringBuilder resultWord = new StringBuilder();

        int i = 0;
        for (String ch : one.split("")) {
            resultWord.append(ch);
            if (i <= two.length() - 1) {
                resultWord.append(two.charAt(i++));
            }
        }

        while(i <= two.length() -1) {
            resultWord.append(two.charAt(i++));
        }
        return resultWord.toString();
    }
}
