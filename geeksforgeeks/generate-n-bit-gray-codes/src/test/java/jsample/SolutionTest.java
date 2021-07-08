package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    private Solution3 solution3 = new Solution3();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(2)).containsExactly(0, 1, 3, 2);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(3)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4);
        AssertionsForInterfaceTypes.assertThat(solution1.solve(4)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8);

        AssertionsForInterfaceTypes.assertThat(solution2.solve(2)).containsExactly(0, 1, 3, 2);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(3)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4);
        AssertionsForInterfaceTypes.assertThat(solution2.solve(4)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8);

        AssertionsForInterfaceTypes.assertThat(solution3.solve(2)).containsExactly(0, 1, 3, 2);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(3)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4);
        AssertionsForInterfaceTypes.assertThat(solution3.solve(4)).containsExactly(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8);
    }
}
