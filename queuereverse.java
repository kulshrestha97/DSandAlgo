import java.util.*;

class myQueue<T> {
    Stack<T> queueStack = new Stack<T>();
    Stack<T> reverseQueueStack = new Stack<T>();

    public void enqueue(T value) {
        queueStack.push(value);
        return;

    }

    public String reverseEnqueue() {
        while (!queueStack.isEmpty()) {
            reverseQueueStack.push(queueStack.pop());
        }
        return reverseQueueStack.toString();

    }

}

public class queuereverse {
    public static void main(String[] args) {
        myQueue<Integer> mQue = new myQueue();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while (size-- > 0) {
            mQue.enqueue(sc.nextInt());
        }
        System.out.print(mQue.reverseEnqueue());

    }
}