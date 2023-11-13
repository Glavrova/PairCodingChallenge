
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> itemList = Arrays.asList(args[0].split(","));
        Map<Integer, Integer> itemCount = new HashMap<>();
        Map.Entry<Integer,Integer> max = null;
        itemList.stream().forEach(i -> itemCount.merge(Integer.valueOf(i), 1, Integer::sum));

        for (Map.Entry<Integer, Integer> e : itemCount.entrySet()) {
            if (max == null || (e.getValue() > max.getValue())) {
                max = e;
            }
        }
        System.out.println(String.format("The majority item is %d with %d occurrences", max.getKey(), max.getValue()));

        max = itemCount.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get();
        System.out.println(String.format("The majority item is %d with %d occurrences", max.getKey(), max.getValue()));
    }
}

