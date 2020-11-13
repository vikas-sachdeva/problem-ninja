package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        solution.solve(node);
        AssertionsForInterfaceTypes.assertThat(node.next).isNull();
        AssertionsForInterfaceTypes.assertThat(node.left.next).isEqualTo(node.right);
        AssertionsForInterfaceTypes.assertThat(node.right.next).isNull();
        AssertionsForInterfaceTypes.assertThat(node.left.left.next).isEqualTo(node.left.right);
        AssertionsForInterfaceTypes.assertThat(node.left.right.next).isEqualTo(node.right.left);
        AssertionsForInterfaceTypes.assertThat(node.right.left.next).isEqualTo(node.right.right);
        AssertionsForInterfaceTypes.assertThat(node.right.right.next).isNull();
    }
}
