package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("(1+(2*3)+((8)/4))+1")).isEqualTo(3);
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("(1)+((2))+(((3)))")).isEqualTo(3);
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("1+(2*3)/(2-1)")).isEqualTo(1);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("1")).isEqualTo(0);
    }
}
