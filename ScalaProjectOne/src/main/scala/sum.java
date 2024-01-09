import scala.Int;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 8;
        System.out.println(sumOfTwo(list,sum));
    }
    public static List<Integer> sumOfTwo(ArrayList<Integer> list, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int y = sum - list.get(i);
            if (map.containsKey(y) ) {
                return new ArrayList<>(Arrays.asList(map.get(y),i));
            }
            map.put(list.get(i), i);
        }
        return null;
    }
}
