package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(1)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(4)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(9)).isTrue();
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution2.solve(1)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(4)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(9)).isTrue();
    }

    @Test
    void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(2)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(3)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(5)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(6)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(7)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(8)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(17)).isFalse();
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution2.solve(2)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(3)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(5)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(6)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(7)).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(8)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(17)).isFalse();
    }
}
