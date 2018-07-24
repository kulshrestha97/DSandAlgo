import java.util.*;

public class bracketbalancing {
    public static boolean bracket(String s) {
        Stack<Character> stk = new Stack<>();
        if (s.isEmpty() || s == null) {
            return true;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stk.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == ')' && (!stk.isEmpty())) {
                        if (stk.peek() == '(') {
                            stk.pop();
                        }

                    } else if (s.charAt(i) == '}' && (!stk.isEmpty())) {
                        if (stk.peek() == '{') {
                            stk.pop();
                        }

                    } else if (s.charAt(i) == ']' && (!stk.isEmpty())) {
                        if (stk.peek() == '[') {
                            stk.pop();
                        }

                    }
                }
            }

        }
        if (stk.isEmpty()) {
            System.out.println(stk.toString());
            System.out.println("Matched");
            return true;
        } else {
            System.out.println(stk.toString());
            System.out.println("UnMatched");
            return false;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = sc.next();
        bracket(query);

    }

}
