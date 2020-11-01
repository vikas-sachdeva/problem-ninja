package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    private Solution3 solution3 = new Solution3();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{12, 3, 4, 1, 6, 9}, 24)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 2, 3, 4, 5}, 9)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 4, 45, 6, 10, 8}, 22)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 2, 4, 1}, 5)).isFalse();
    }

    @Test
    public void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{12, 3, 4, 1, 6, 9}, 24)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 2, 3, 4, 5}, 9)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 4, 45, 6, 10, 8}, 22)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 2, 4, 1}, 5)).isFalse();
    }

    @Test
    public void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{12, 3, 4, 1, 6, 9}, 24)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 2, 3, 4, 5}, 9)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 4, 45, 6, 10, 8}, 22)).isTrue();
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 2, 4, 1}, 5)).isFalse();
    }
}
