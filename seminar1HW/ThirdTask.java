package seminar1HW;

public class ThirdTask{
    public String reverseWords(String s) {
        if (s.equals(null) || s.equals(""))
            return s;
        String ret = "";
        int i = 0;
        int l = s.length();
        while (i < l) {
            while (i < l && s.charAt(i) == ' ')
                i++;
            String w = "";
            while (i < l && s.charAt(i) != ' ') {
                w += s.charAt(i);
                i++;
            }
            if (!w.equals(""))
                ret = w + " " + ret;
        }
        return ret.isEmpty()?"":ret.substring(0, ret.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(new ThirdTask().reverseWords("the sky is blue"));
        System.out.println(new ThirdTask().reverseWords("  hello world  "));
        System.out.println(new ThirdTask().reverseWords("a good   example"));

    }
}