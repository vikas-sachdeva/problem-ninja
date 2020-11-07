package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(3);
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);
        ListNode head = solution.solve(head1, head2);
        AssertionsForInterfaceTypes.assertThat(head.val).isEqualTo(7);
        AssertionsForInterfaceTypes.assertThat(head.next.val).isEqualTo(8);
        AssertionsForInterfaceTypes.assertThat(head.next.next.val).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(head.next.next.next.val).isEqualTo(7);
    }

    @Test
    void solveTest2() {
        ListNode head1 = new ListNode(9);
        ListNode head2 = new ListNode(9);
        ListNode head = solution.solve(head1, head2);
        AssertionsForInterfaceTypes.assertThat(head.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(head.next.val).isEqualTo(8);
    }

    @Test
    void solveTest3() {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        ListNode head = solution.solve(head1, head2);
        AssertionsForInterfaceTypes.assertThat(head.val).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(head.next.val).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(head.next.val).isEqualTo(0);
    }
}
