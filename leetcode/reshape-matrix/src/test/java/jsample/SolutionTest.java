package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        AssertionsForInterfaceTypes.assertThat(solution.solve(mat, 1, 4)).containsExactly(new int[][]{{1, 2, 3, 4}});
    }

    @Test
    void solveTest2() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        AssertionsForInterfaceTypes.assertThat(solution.solve(mat, 2, 4)).containsExactly(new int[][]{{1, 2}, {3, 4}});
    }
}