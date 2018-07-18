import java.util.*;
import java.io.*;
public class binarytreebfs
{
    static class Node
    {
        int key;
        Node left,right;

        Node(int val)
        {
            this.key=val;
            left=right=null;
        }
    }

    static void bfs(Node temp)
    {
        Queue<Node> q = new LinkedList<Node>(); // Queue is implemented as LinkedList here.
        q.add(temp);
        while(!q.isEmpty())
        {
            temp = q.peek();
            System.out.print(temp.key+" ");
            q.remove();
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }

        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("After doing Breadth First Traversal the outcome is \n");
        bfs(root);
    }

}