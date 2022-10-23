package seminar1HW;

import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) {
        String[] nums = {"3","2","2","3"};
        String val = "3";
        int j = 0;

          for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                nums[i] = "_";       
            }else{
                nums[i-1] = nums[i];
                nums[i] = "_";
                j++;
            }
          }  

          System.out.printf(j + ", nums = " + Arrays.toString(nums));
          
    }
}
