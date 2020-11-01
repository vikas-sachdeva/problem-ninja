package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("100100")).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(solution.solve("10010")).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve("10011")).isEqualTo(0);
    }
}
