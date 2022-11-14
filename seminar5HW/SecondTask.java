package seminar5HW;

import java.util.HashMap;
import java.util.Map;

public class SecondTask {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : words1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (String j : words2) {
            if (map.containsKey(j)) {
                int temp = map.get(j);
                if (temp > 1)
                    continue;
                map.put(j, map.get(j) - 1);
            }
        }
        int count = 0;
        for (String k : map.keySet()) {
            if (map.get(k) == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
            new SecondTask()
                    .countWords(
                        new String[] { "leetcode", "is", "amazing", "as", "is" },
                        new String[] { "amazing", "leetcode", "is" }));
        System.out.println(
            new SecondTask()
                    .countWords(
                        new String[] { "b", "bb", "bbb" }, 
                        new String[] { "a", "aa", "aaa" }));
        System.out.println(
            new SecondTask()
                    .countWords(
                        new String[] { "a", "ab" }, 
                        new String[] { "a", "a", "a", "ab" }));
    }
}
