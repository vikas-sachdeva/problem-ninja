package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(head)).isEqualTo(5);
    }

    @Test
    void solveTest2() {
        ListNode head = new ListNode(0);
        AssertionsForInterfaceTypes.assertThat(solution.solve(head)).isEqualTo(0);
    }

    @Test
    void solveTest3() {
        ListNode head = new ListNode(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(head)).isEqualTo(1);
    }

    @Test
    void solveTest4() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        AssertionsForInterfaceTypes.assertThat(solution.solve(head)).isEqualTo(0);
    }

    @Test
    void solveTest5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        AssertionsForInterfaceTypes.assertThat(solution.solve(head)).isEqualTo(18880);
    }

}
