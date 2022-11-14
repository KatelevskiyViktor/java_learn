package seminar5HW;

import java.util.HashSet;
import java.util.Set;

public class ThirdTask {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                if (i <= k)
                    return true;
                else {
                    for (int j = i - k; j < i; j++)
                        if (nums[j] == nums[i])
                            return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(
                new ThirdTask().containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
        System.out.println(
                new ThirdTask().containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));
        System.out.println(
                new ThirdTask().containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));

    }
}
