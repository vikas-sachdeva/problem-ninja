package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    void solveTest1() {
        int[][] matrix = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};
        AssertionsForInterfaceTypes.assertThat(solution1.solve(matrix)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(matrix)).isEqualTo(2);
    }

    @Test
    void solveTest2() {
        int[][] matrix = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
        AssertionsForInterfaceTypes.assertThat(solution1.solve(matrix)).isEqualTo(-1);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(matrix)).isEqualTo(-1);
    }

    @Test
    void solveTest3() {
        int[][] matrix = new int[][]{{0, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        AssertionsForInterfaceTypes.assertThat(solution1.solve(matrix)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(matrix)).isEqualTo(0);
    }
}
