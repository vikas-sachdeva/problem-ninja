package jsample;

public class Solution {

    private TreeNode[] array;

    private int index;

    public void solve(TreeNode root) {
        array = new TreeNode[1001];
        index = 0;
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            array[index] = node;
            int i = index;
            while (i > 0 && array[i - 1].val > array[i].val) {
                int temp = array[i].val;
                array[i].val = array[i - 1].val;
                array[i - 1].val = temp;
                i--;
            }
            index++;
            inOrderTraversal(node.right);
        }
    }
}