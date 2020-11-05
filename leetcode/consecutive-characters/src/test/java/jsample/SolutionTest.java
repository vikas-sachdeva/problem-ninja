package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("leetcode")).isEqualTo(2);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("abbcccddddeeeeedcba")).isEqualTo(5);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("triplepillooooow")).isEqualTo(5);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("hooraaaaaaaaaaay")).isEqualTo(11);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("tourist")).isEqualTo(1);
    }

    @Test
    void solveTest6() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("t")).isEqualTo(1);
    }

    @Test
    void solveTest7() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("tt")).isEqualTo(2);
    }
}
