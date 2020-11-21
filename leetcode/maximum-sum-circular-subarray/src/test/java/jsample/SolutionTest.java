package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, -2, 3, -2})).isEqualTo(3);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{5, -3, 5})).isEqualTo(10);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{3, -1, 2, -1})).isEqualTo(4);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{3, -2, 2, -3})).isEqualTo(3);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{-2, -3, -1})).isEqualTo(-1);
    }
}
