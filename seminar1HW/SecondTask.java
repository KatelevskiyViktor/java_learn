package seminar1HW;

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 2, 3, 4};
        int temp_num = -1;
        int temp_num2 = 0;
        for (int i = 0; i < arr.length; i++) {
                if(i == arr.length-1){
                    if(temp_num == -1)arr[0] = temp_num2;
                    if(temp_num2 == 0)arr[0] = temp_num;
                }else{
                    if(temp_num == -1){
                        temp_num = arr[i + 1];
                        if(temp_num2 == 0)arr[i + 1] = arr[i];
                        else{
                            arr[i + 1] = temp_num2;
                            temp_num2 = 0;
                        } 
                    }else{
                        temp_num2 = arr[i + 1];
                        arr[i + 1] = temp_num;
                        temp_num = -1;
                    }
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}
