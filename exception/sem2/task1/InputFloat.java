package exception.sem2.task1;

import java.util.Scanner;

public class InputFloat {
    public float checkFloat() {
        Scanner console = new Scanner(System.in);
        float num = 1;
        
        try {
            System.out.print("Enter your number: ");
            num = console.nextFloat();
        } catch (Exception e) {
            checkFloat();
        }

        console.close();
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new InputFloat().checkFloat());
    }
}
