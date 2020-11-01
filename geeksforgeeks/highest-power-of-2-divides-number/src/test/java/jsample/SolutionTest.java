package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(48)).isEqualTo(16);
        AssertionsForInterfaceTypes.assertThat(solution.solve(5)).isEqualTo(1);
    }
}
