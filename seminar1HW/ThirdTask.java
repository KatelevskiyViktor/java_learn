package seminar1HW;

import java.util.StringTokenizer;

public class ThirdTask{
    public static String[] reverse(String[] words) {
        String[] newArray = new String[words.length];
 
        for (int i = 0; i < words.length; i++) {
            newArray[words.length - 1 - i] = words[i];
        }
 
        return newArray;
    }

   public static String[] my_split(String str){
    String delims = " ";
    int i = 0;
    String[] words = new String[4];
    StringTokenizer st = new StringTokenizer(str, delims);
    
            while (st.hasMoreTokens())
             {
                 words[i] = st.nextToken();
                 i++;
             }

             return words;
   }
    public static void main(String[] args) {
        String str = "the sky is blue";
        // String[] words = str.split(" ");
        String[] words = my_split(str);
        words = reverse(words);
        str = String.join(" ", words);
        System.out.println(str);

        

    }
}