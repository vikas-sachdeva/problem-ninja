package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(17)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(27)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution.solve(30)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(solution.solve(43)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution.solve(44)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(solution.solve(45)).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(solution.solve(46)).isEqualTo(4);
    }
}
