package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{3, 1, 4, 2})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{-1, 3, 2, 0})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 2, 3, 4})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 3, 2})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{3, 1, 4, 2})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{-1, 3, 2, 0})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 2, 3, 4})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 3, 2})).isTrue();
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 3})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{3, 4, 6, 8, 1, 5, 2})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{3, 4, 6, 8, 1, 5, 6})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 3})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1})).isFalse();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{3, 4, 6, 8, 1, 5, 2})).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{3, 4, 6, 8, 1, 5, 6})).isTrue();
    }
}
