
import java.util.*;
import java.util.stream.Collectors;

public class PrintUnique {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,5};

        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        HashMap<Integer, Boolean> map = new LinkedHashMap<>();
        int n = nums.length;
        Arrays.sort(nums);

            for (int i = 0; i < n - 1; i++){

                if (nums[i] == nums[i + 1]){

                    map.put(nums[i], false);
                    map.put(nums[++i], false);

                } else {

                    map.put(nums[i], true);

                }
            }

            if (!map.containsKey(nums[n-1])) map.put(nums[n-1], true);

        map.entrySet().stream().filter(Map.Entry::getValue).mapToInt(Map.Entry::getKey).forEach(System.out::println);

    }

}
