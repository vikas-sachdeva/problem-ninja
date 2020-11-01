package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    private Solution3 solution3 = new Solution3();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 4, 6, 2, 3, 8}, 24)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{0, 4, 6, 2, 3, 8}, 18)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{4, 5, 2, 7, 11}, 110)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 2, 3, 2, 4, 1, 5}, 4)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new int[]{1, 1, 2, 1, 2, 2}, 8)).isEqualTo(1);
    }

    @Test
    public void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 4, 6, 2, 3, 8}, 24)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{0, 4, 6, 2, 3, 8}, 18)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{4, 5, 2, 7, 11}, 110)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 2, 3, 2, 4, 1, 5}, 4)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new int[]{1, 1, 2, 1, 2, 2}, 8)).isEqualTo(1);
    }

    @Test
    public void solveTest3() {
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 4, 6, 2, 3, 8}, 24)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{0, 4, 6, 2, 3, 8}, 18)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{4, 5, 2, 7, 11}, 110)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 2, 3, 2, 4, 1, 5}, 4)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(new int[]{1, 1, 2, 1, 2, 2}, 8)).isEqualTo(1);
    }
}