import java.util.*;

public class MiniDepthOfBT {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.right = this.left = null;
        }
    }

    // Function to find minimum depth
    public static int minDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();

                // If it's a leaf node, return current depth
                if (current.left == null && current.right == null) {
                    return depth;
                }

                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }
            depth++;
        }

        return depth; // Not actually reached
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
        root.right.left = new Node(9);

        System.out.println("Minimum Depth of Binary Tree: " + minDepth(root));
    }
}