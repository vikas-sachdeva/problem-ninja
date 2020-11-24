package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("3+2*2")).isEqualTo(7);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(" 3/2 ")).isEqualTo(1);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(" 3+5 / 2 ")).isEqualTo(5);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("42")).isEqualTo(42);
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("1-1+1")).isEqualTo(1);
    }

    @Test
    void solveTest6() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("1337")).isEqualTo(1337);
    }

    @Test
    void solveTest7() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("2*3*4")).isEqualTo(24);
    }
}
