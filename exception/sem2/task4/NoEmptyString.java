package exception.sem2.task4;

import java.util.Scanner;

public class NoEmptyString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = console.nextLine();
        if (str == "")
            System.out.println("Do not enter empty string!");
        else
            System.out.println(str);
        console.close();

    }
}
