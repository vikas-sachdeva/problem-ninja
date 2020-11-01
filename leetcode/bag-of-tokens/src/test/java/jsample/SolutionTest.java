package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{100, 200, 300, 400}, 200)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{100, 200}, 150)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{100}, 50)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{81, 91, 31}, 73)).isEqualTo(1);
    }
}
