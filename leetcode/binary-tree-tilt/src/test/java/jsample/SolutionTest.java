package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        AssertionsForInterfaceTypes.assertThat(solution.solve(root)).isEqualTo(1);
    }

    @Test
    void solveTest2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(7);
        AssertionsForInterfaceTypes.assertThat(solution.solve(root)).isEqualTo(15);
    }

    @Test
    void solveTest3() {
        TreeNode root = new TreeNode(21);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(3);
        root.right = new TreeNode(14);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
        AssertionsForInterfaceTypes.assertThat(solution.solve(root)).isEqualTo(9);
    }
}
