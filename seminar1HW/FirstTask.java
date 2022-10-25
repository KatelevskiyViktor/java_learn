package seminar1HW;

import java.util.Arrays;

public class FirstTask {
    
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
           for(int i=0;i<nums.length;i++){
               int j=nums[i];
               arr[i]=nums[j];
           }
       return arr;
   }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FirstTask().buildArray(new int[]{0,2,1,5,3,4})));
        System.out.println(Arrays.toString(new FirstTask().buildArray(new int[]{5,0,1,2,3,4})));
    }
}
