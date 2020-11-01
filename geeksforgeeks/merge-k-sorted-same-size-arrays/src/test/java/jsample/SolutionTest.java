package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(3, 4, new int[][]{{1, 3, 5, 7}, {2, 4, 6, 8}, {0, 9, 10, 11}}))
                                   .containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(3, 4, new int[][]{{1, 3, 5, 7}, {2, 4, 6, 8}, {0, 9, 10, 11}}))
                                   .containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    }

    @Test
    public void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(
                solution1.solve(4, 4, new int[][]{{1, 5, 6, 8}, {2, 4, 10, 12}, {3, 7, 9, 11}, {13, 14, 15, 16}}))
                                   .containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        AssertionsForInterfaceTypes.assertThat(
                solution2.solve(4, 4, new int[][]{{1, 5, 6, 8}, {2, 4, 10, 12}, {3, 7, 9, 11}, {13, 14, 15, 16}}))
                                   .containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    }
}
