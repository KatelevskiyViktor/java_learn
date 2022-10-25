package seminar1HW;


public class SecondTask {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        for (int i=0; i<l; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[l-- -1];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(new SecondTask().removeElement(new int[]{5, 0, 1, 2, 3, 4}, 3));
        System.out.println(new SecondTask().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
