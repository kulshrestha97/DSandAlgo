import java.util.*;
import java.io.*;

public class tree {

    public static class node {
        int data;
        node left;
        node right;

        node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static void postordertraversal(node root) {
        if (root == null) {
            return;
        }

        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.println(root.data);

    }

    public static void preordertraversal(node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

    public static void inordertraversal(node root) {
        if (null == root) {
            return;
        }
        inordertraversal(root.left);
        System.out.println(root.data);
        inordertraversal(root.right);
    }
    public static void breadthfirstorder(node root)
    {
        Queue<node> que = new LinkedList<>();
        node temp;
        que.add(root);
        while (!que.isEmpty()) {
            temp = que.peek();
            
            
            System.out.print(temp.data + " ");
            que.remove();
            if (temp.left != null) {
                que.add(temp.left);
            }
            if (temp.right != null) {
                que.add(temp.right);
            }

        }
        
    }
    public static int fullNodesnumber(node root)
    {
        Queue<node> que = new LinkedList<node>();
        que.add(root);
        int count=0;
        while(!que.isEmpty())
        {
            node temp = que.peek();
            que.remove();
            if(temp.left!=null && temp.right!=null)
            {
                count++;
                
            }
            if(temp.left!=null)
            {
                que.add(temp.left);
            }
            if(temp.right!=null)
            {
                que.add(temp.right);
            }
            
        }
        return count;

        
    }



    public static int findMaximum(node root)
    {
        int maximum = Integer.MIN_VALUE;
        if(root==null)
        {
            return maximum;
        }
        int data = root.data;
        int leftMaximum = findMaximum(root.left);
        int rightMaximum = findMaximum(root.right);
        if(leftMaximum>rightMaximum)
        {
            maximum = leftMaximum;
        }
        else
        {
            maximum = rightMaximum;
        }
        if(root.data>maximum)
        {
            maximum = root.data;
        }
        return maximum;
    }
    public static boolean searchElement(node root, int value)
    {
        boolean flag = false;
        if(root==null)
        {
            
            return flag;
        }
        if(root.data==value)
        {
            System.out.println("Data Found");
            flag = true;
        }
        searchElement(root.left, value);
        searchElement(root.right, value);
        return flag;
    }
    public static int findSize(node root)
    {
        int size = 0;
        if(root==null)
        {
            return 0;
        }
        size++;        
        
        
        return size+findSize(root.left)+findSize(root.right);
        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strarray = sc.nextLine();
        
        node root = new node(1);
        node left = new node(2);
        node right = new node(3);
        root.left = left;
        root.right = right;
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        
        System.out.println("PRE ORDER TRAVERSAL\n\n");
        preordertraversal(root);
        System.out.println("POST ORDER TRAVERSAL\n\n");
        postordertraversal(root);
        System.out.println("INORDER TRAVERSAL\n\n");
        inordertraversal(root);
        System.out.println("BREADTH FIRST ORDER\n\n");
        breadthfirstorder(root);
        System.out.println("\nMaximum is:"+findMaximum(root));
        searchElement(root, 5);
        System.out.println(findSize(root));
        System.out.println(fullNodesnumber(root));
        //printReverseTree(root);

        
    }

}