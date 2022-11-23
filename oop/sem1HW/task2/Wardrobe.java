package oop.sem1HW.task2;

import java.util.Arrays;

public class Wardrobe {
    static boolean door = false;
    public static String[] clothes = new String[5];

    @Override
    public String toString() {       
        return "In wardrobe is: " + Arrays.toString(clothes);
    }
}
