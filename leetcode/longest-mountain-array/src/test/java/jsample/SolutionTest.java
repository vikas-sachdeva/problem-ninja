package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{2, 1, 4, 7, 3, 2, 5})).isEqualTo(5);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{2, 2, 2})).isEqualTo(0);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 1, 4, 7, 3, 2, 5})).isEqualTo(6);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 1, 4, 7, 3, 2, 1})).isEqualTo(7);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 1, 4, 1, 2, 3, 4, 7, 3, 2, 1})).isEqualTo(8);
    }

    @Test
    void solveTest6() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 1})).isEqualTo(0);
    }

    @Test
    void solveTest7() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 0})).isEqualTo(0);
    }

    @Test
    void solveTest8() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{1, 0, 1})).isEqualTo(0);
    }

    @Test
    void solveTest9() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 1, 4, 1, 2, 3, 4, 7})).isEqualTo(4);
    }

    @Test
    void solveTest10() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(new int[]{0, 0, 1, 0, 0, 1, 1, 1, 1, 1})).isEqualTo(3);
    }
}