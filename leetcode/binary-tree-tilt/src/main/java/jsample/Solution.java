package jsample;

public class Solution {

    private int sum = 0;

    public int solve(TreeNode root) {
        findSum(root);
        return sum;
    }

    private int findSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = findSum(node.left);
        int rightSum = findSum(node.right);
        int treeSum = leftSum > rightSum ? leftSum - rightSum : rightSum - leftSum;
        sum += treeSum;
        return leftSum + rightSum + node.val;
    }
}
