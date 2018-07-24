import java.util.*;

public class postfixtoinfix
{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Stack<String> stk = new Stack<String>();
     String b = sc.next();
     for(int i = 0;i<b.length();i++)
     {
         if(Character.isLetterOrDigit(b.charAt(i)))
         {
             stk.add(Character.toString(b.charAt(i)));
         }
         else
         {
             String op2 = stk.pop();
             String op1 = stk.pop();
             String res = "("+op1+Character.toString(b.charAt(i))+op2+")";
             stk.add(res);
         }
        
     }
     System.out.println(stk.peek());
    }
}