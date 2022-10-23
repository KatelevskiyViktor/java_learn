package seminar1HW;

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        String[] nums = {"0","1","2","2","3","0","4","2"};
        String val = "2";
        int j = 1;
        int indexThi = 0;
        int indexFou = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                nums[i] = "_";       
            }else{
                if(i > 0 && nums[i-1] == "_"){
                    while (i-j > 0 && nums[i-j] == "_") {
                        j++;
                    }
                    if(nums[i-j] != "_")j--;
                    nums[i-j] = nums[i];
                    nums[i] = "_";   
                }
            }
            
          }
          
          for (int i = 0; i < nums.length; i++) {
            if(nums[i] == "3")indexThi = i;
            else if(nums[i] == "4")indexFou = i;
          }
        
          nums[indexFou] = "3";
          nums[indexThi] = "4";
          
          System.out.println(Arrays.toString(nums));
    }
}
