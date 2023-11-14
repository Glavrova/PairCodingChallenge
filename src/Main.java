
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,2,2,1};

        Map<Integer, Integer> itemCount = new HashMap<>();
        Map.Entry<Integer,Integer> max = null;

        for (int i : nums) {
            itemCount.merge(Integer.valueOf(i), 1, Integer::sum);
        }

        max = itemCount.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get();

        System.out.println(String.format("The majority item is %d with %d occurrences", max.getKey(), max.getValue()));
    }
}

