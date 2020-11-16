package jsample;

public class Solution {

    public int solve(TreeNode root, int low, int high) {
        return traverse(root, low, high);
    }

    private int traverse(TreeNode node, int low, int high) {
        int sum = 0;
        if (node == null) {
            return 0;
        }
        sum = node.val >= low && node.val <= high ? node.val : 0;
        if (node.val > low) {
            sum += traverse(node.left, low, high);
        }
        if (node.val < high) {
            sum += traverse(node.right, low, high);
        }
        return sum;
    }
}