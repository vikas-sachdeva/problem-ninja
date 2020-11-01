package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(4, new int[]{5, 1, 1, 4})).isEqualTo(10);
        AssertionsForInterfaceTypes.assertThat(solution.solve(3, new int[]{2, 1, 2})).isEqualTo(2);
    }
}
