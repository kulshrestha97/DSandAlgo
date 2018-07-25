import java.util.*;

public class pairViseCons {
    public static boolean pairViseCons(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        int si = q.size() / 2;
        while (si-- > 0) {
            int a = q.remove();
            int b = q.remove();
            if (Math.abs(a - b) == 1) {
                continue;
            } else {
                s.push(a);
                s.push(b);
            }

        }
        if (s.isEmpty()) {
            System.out.println("Indeed its true");
            return true;
        } else {
            System.out.println("False");

            return false;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(4);
        stk.push(5);
        stk.push(-2);
        stk.push(-3);
        stk.push(11);
        stk.push(10);
        stk.push(5);
        stk.push(6);
        stk.push(20);
        if (!(stk.size() % 2 == 0)) {
            int a = stk.pop();
            pairViseCons(stk);
        }

        else {
            pairViseCons(stk);
        }

    }
}
