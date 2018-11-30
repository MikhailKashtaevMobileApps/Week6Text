package com.example.mike.week6test;

import java.util.Stack;

public class BinaryTreeRecursion {

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class BinaryTree {

        Node root;

        void iterativePreorder()
        {
            iterativePreorder(root);
        }

        void iterativePreorder(Node node) {

            if (node == null) {
                return;
            }

            Stack<Node> nodeStack = new Stack<Node>();
            nodeStack.push(root);

            while (nodeStack.empty() == false) {

                Node mynode = nodeStack.peek();
                System.out.print(mynode.data + " ");
                nodeStack.pop();

                if (mynode.right != null) {
                    nodeStack.push(mynode.right);
                }
                if (mynode.left != null) {
                    nodeStack.push(mynode.left);
                }
            }
        }
    }
}
