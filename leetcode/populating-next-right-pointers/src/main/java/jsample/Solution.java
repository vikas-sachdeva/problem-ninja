package jsample;

public class Solution {

    private Node next;

    public Node solve(Node root) {
        if (root == null) {
            return null;
        }
        int height = getHeight(root);
        for (int i = 0; i < height; i++) {
            next = null;
            levelOrderTraversal(root, i);
        }
        return root;
    }

    private void levelOrderTraversal(Node node, int level) {
        if (level == 0) {
            node.next = next;
            next = node;
        } else {
            levelOrderTraversal(node.right, level - 1);
            levelOrderTraversal(node.left, level - 1);
        }
    }

    private int getHeight(Node node) {
        Node temp = node;
        int height = 0;
        while (temp != null) {
            temp = temp.left;
            height++;
        }
        return height;
    }
}