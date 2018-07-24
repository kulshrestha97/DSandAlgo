import java.util.*;

public class postfixtoprefix {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        for (int i = 0; i < b.length(); i++) {
            if (Character.isLetterOrDigit(b.charAt(i))) {
                stk.add(Character.toString(b.charAt(i)));

            } else {
                String op2 = stk.pop();
                String op1 = stk.pop();
                String res = Character.toString(b.charAt(i)) + op1 + op2;
                System.out.println(res);
                stk.add(res);
            }
        }
        System.out.println(stk.peek());
    }
}