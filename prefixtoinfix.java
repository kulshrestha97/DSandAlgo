import java.util.*;

public class prefixtoinfix {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        String b = str.reverse().toString();
        for (int i = 0; i < b.length(); i++) {
            if (Character.isLetterOrDigit(b.charAt(i))) {

                System.out.println("I am if");
                System.out.println(b.charAt(i));
                stk.add(Character.toString(b.charAt(i)));
            } else {
                System.out.println("I am else");
                System.out.println(b.charAt(i));
                String op1 = stk.pop();
                String op2 = stk.pop();
                String res = "(" + op1 + Character.toString(b.charAt(i)) + op2 + ")";
                stk.add(res);

            }
        }
        System.out.print(stk.pop());

    }
}