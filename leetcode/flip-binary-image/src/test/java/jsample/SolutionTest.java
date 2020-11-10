package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}))
                                   .containsExactly(new int[]{1, 0, 0}, new int[]{0, 1, 0}, new int[]{1, 1, 1});
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}))
                                   .containsExactly(new int[]{1, 1, 0, 0}, new int[]{0, 1, 1, 0}, new int[]{0, 0, 0, 1},
                                                    new int[]{1, 0, 1, 0});
    }
}
