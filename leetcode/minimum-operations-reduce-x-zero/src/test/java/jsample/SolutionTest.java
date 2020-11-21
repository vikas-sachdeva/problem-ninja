package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 1, 4, 2, 3}, 5)).isEqualTo(2);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{5, 6, 7, 8, 9}, 4)).isEqualTo(-1);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{3, 2, 20, 1, 1, 3}, 10)).isEqualTo(5);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(
                solution.solve(new int[]{8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993, 9904, 8819, 1231, 6309},
                        134365)).isEqualTo(16);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{5, 2, 3, 1, 1}, 5)).isEqualTo(1);
    }
}