
import java.util.Scanner;

class Main {
    public static String lameDb(String db, String op, String id, String data) {

        String[] words = db.split("#");
        int index = Integer.parseInt(id);
        switch(op) {
            case "add" :
                db = db.concat("#"+ id + data);
                return db;
            case "edit" :
                words[index - 1] = id + data;
                db = String.join("#", words);
                return db;
            case "delete" :
                String[] newArray = new String[words.length - 1];
                int i = 0;
                for (String str : words){
                    if (str.startsWith(id)) continue;
                    newArray[i++] = str;
                }
                return String.join("#", newArray);
        }

        return null;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb("1etsy#2wooden#3spoon", "edit", "2", "aaa"));

    }

}

