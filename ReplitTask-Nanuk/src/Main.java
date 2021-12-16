import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "5", "nanuk"));
        int way_stones = 3;
        int boast = 5;
        System.out.println(nanuk3(list,way_stones,boast));
    }

    public static boolean nanuk(ArrayList<String> list, int wayStones, int boast){
        int points = 0;
        int nanuks = 0;
        for (String str : list) {
            if (str.equalsIgnoreCase("nanuk")){
                nanuks++;
                continue;
            }
            points += Integer.parseInt(str);
        }
        return points >= boast && wayStones >= nanuks ;
    }

    public static boolean nanuk2(ArrayList<String> list, int wayStones, int boast){

        int initialArrayLength = list.size();
        list.removeIf(color -> color.equalsIgnoreCase("nanuk"));
        int nanuks = initialArrayLength - list.size();

        int points = 0;
        for (String str : list) points += Integer.parseInt(str);

        return points >= boast && wayStones >= nanuks;
    }

    public static boolean nanuk3(ArrayList<String> list, int wayStones, int boast){

        int i = 0;
        while (i < list.size()){
            if (list.get(i).equalsIgnoreCase("nanuk")) {
                wayStones--;
                i++;
                continue;
            }
            boast -= Integer.parseInt(list.get(i++));
        }

        return wayStones >= 0 && boast <= 0;

    }
}
