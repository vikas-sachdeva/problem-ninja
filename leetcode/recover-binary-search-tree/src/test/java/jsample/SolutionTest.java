package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(3);
        rootNode.left.right = new TreeNode(2);
        solution.solve(rootNode);
        AssertionsForInterfaceTypes.assertThat(rootNode.val).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(rootNode.left.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(rootNode.left.right.val).isEqualTo(2);
    }

    @Test
    void solveTest2() {
        TreeNode rootNode = new TreeNode(3);
        rootNode.left = new TreeNode(1);
        rootNode.right = new TreeNode(4);
        rootNode.right.left = new TreeNode(2);
        solution.solve(rootNode);
        AssertionsForInterfaceTypes.assertThat(rootNode.val).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(rootNode.left.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(rootNode.right.val).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(rootNode.right.left.val).isEqualTo(3);
    }

    @Test
    void solveTest3() {
        TreeNode rootNode = new TreeNode(2);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(1);
        solution.solve(rootNode);
        AssertionsForInterfaceTypes.assertThat(rootNode.val).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(rootNode.left.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(rootNode.right.val).isEqualTo(3);
    }

    @Test
    void solveTest4() {
        TreeNode rootNode = new TreeNode(3);
        rootNode.right = new TreeNode(2);
        rootNode.right.right = new TreeNode(1);
        solution.solve(rootNode);
        AssertionsForInterfaceTypes.assertThat(rootNode.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(rootNode.right.val).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(rootNode.right.right.val).isEqualTo(3);
    }
}
