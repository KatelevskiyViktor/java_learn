package exception.sem1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeMethodsAndDifException {
    public void one(int index){

        int[] arr = new int[]{1,2,3,4,5};
        try{
           System.out.println(arr[index]);           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void two(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        
        try{
            s = reader.readLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(s);
    }

    public void three(int index){

        int[] arr = new int[]{1,2,3,4,5};
        if(index < 0 || index > arr.length-1)
            System.out.println("Out of bounds"); 
        else
            System.out.println(arr[index]);
            
            
    }
        public static void main(String[] args) {
            new ThreeMethodsAndDifException().one(9);
            new ThreeMethodsAndDifException().two();
            new ThreeMethodsAndDifException().three(9);
        }
    }

