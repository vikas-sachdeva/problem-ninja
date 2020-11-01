package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    private Solution3 solution3 = new Solution3();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{0, -1, 2, -3, 1}, -2)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, -2, 1, 0, 5}, 0)).isFalse();
    }

    @Test
    public void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{0, -1, 2, -3, 1}, -2)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, -2, 1, 0, 5}, 0)).isFalse();
    }

    @Test
    public void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{0, -1, 2, -3, 1}, -2)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, -2, 1, 0, 5}, 0)).isFalse();
    }
}
