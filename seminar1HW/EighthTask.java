package seminar1HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EighthTask {
    // public static void removeElement(Object[] arr, int removedIdx) {
    //     System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    // }

    public static <T> List<T> convertArrayToList(T array[]){

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;
    }

    public static String cleaner(List<Character> list){

        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == " ".charAt(0))list.remove(i);
            if(list.get(i) == ":".charAt(0))list.remove(i);
            if(list.get(i) == ",".charAt(0))list.remove(i);
            if(list.get(i) == " ".charAt(0))list.remove(i);
            
          str += list.get(i);
        }
        return str;
    }

    public static boolean polindrom_checker(String str){
        if(str == " ")return true;
        str = str.toLowerCase();
        String str_normal = "";
        String str_reverse = "";
        char[] chars = str.toCharArray();
        Character[] chars2 = new Character[chars.length];

        for (int i = 0; i < chars.length; i++){
            chars2[i] = chars[i];
        }

        List<Character> list = convertArrayToList(chars2);
        List<Character> list_r = new ArrayList<Character>(list);
        Collections.reverse(list_r);

        str_normal = cleaner(list);
        str_reverse = cleaner(list_r);
        
        return str_normal.equals(str_reverse);
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        String str3 = " ";
        System.out.println(polindrom_checker(str1));
        System.out.println(polindrom_checker(str2));
        System.out.println(polindrom_checker(str3));
    }
}


