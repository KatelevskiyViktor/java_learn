package seminar4HW;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(new SecondTask().evalRPN(new String[]{"2","1","+","3","*"})); 
        System.out.println(new SecondTask().evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(new SecondTask().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public int evalRPN(String[] tokens) {
        int[] s = new int[tokens.length];
        int index = 0;
        for(String op : tokens) {
            if (op.length() > 1) {
                s[index++] = Integer.parseInt(op);
                continue;
            }
            switch(op.charAt(0)) {
                case '+':
                    s[index-2] += s[index-1];
                    index--;
                    break;
                case '-':
                    s[index-2] -= s[index-1];
                    index--;
                    break;
                case '*':
                    s[index-2] *= s[index-1];
                    index--;
                    break;
                case '/':
                    s[index-2] /= s[index-1];
                    index--;
                    break;
                default:
                    s[index++] = Integer.parseInt(op);
                    break;
            }
        }
        return s[0];
    }
}
