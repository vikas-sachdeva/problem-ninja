package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3}, 10)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{2, 3, 3, 5, 3, 4, 1, 7}, 8)).isEqualTo(3);
    }
}
