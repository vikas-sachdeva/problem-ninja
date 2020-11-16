package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("abc", "bca")).isTrue();
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("a", "aa")).isFalse();
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("cabbba", "abbccc")).isTrue();
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("cabbba", "aabbss")).isFalse();
    }

    @Test
    void solveTest5() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("uau", "ssx")).isFalse();
    }
}