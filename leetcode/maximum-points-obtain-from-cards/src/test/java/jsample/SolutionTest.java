package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 2, 3, 4, 5, 6, 1}, 3)).isEqualTo(12);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{2, 2, 2}, 2)).isEqualTo(4);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{9, 7, 7, 9, 7, 7, 9}, 7)).isEqualTo(55);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 1000, 1}, 1)).isEqualTo(1);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3)).isEqualTo(202);
    }

    @Test
    void solveTest6() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30}, 8)).isEqualTo(536);
    }
}