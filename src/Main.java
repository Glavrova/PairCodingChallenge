
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> itemCount = new HashMap<>();
        Map.Entry<Integer,Integer> max = null;

//        int[] itemList = {1,2,3,2,2,1};
//        for (int i : itemList) {
//            itemCount.merge(Integer.valueOf(i), 1, Integer::sum);
//        }
//        for (Map.Entry<Integer, Integer> e : itemCount.entrySet()) {
//            if (max == null || (e.getValue() > max.getValue())) {
//                max = e;
//            }
//        }

        List<Integer> itemList = Arrays.asList(1, 2, 3, 2, 2, 1);
        itemList.stream().forEach(i -> itemCount.merge(Integer.valueOf(i), 1, Integer::sum));
        max = itemCount.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get();

        System.out.println(String.format("The majority item is %d with %d occurrences", max.getKey(), max.getValue()));
    }
}

