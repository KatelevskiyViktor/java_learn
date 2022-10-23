package seminar1HW;

import java.util.Arrays;

public class FirstTask {
    
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int temp_num = 0;
        boolean mark = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 3){
                    temp_num = arr[arr.length-1];
                    arr[arr.length-1] = arr[i];
                    arr[i] = temp_num;
                    mark = true;
                }
                if(arr[j] < arr[i] && !mark){
                        temp_num = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp_num;
                    }    
                }
            }

        System.out.println(Arrays.toString(arr));
    }
}
