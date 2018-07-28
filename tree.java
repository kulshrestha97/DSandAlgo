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

    public static void main(String[] args) {
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

    }

}