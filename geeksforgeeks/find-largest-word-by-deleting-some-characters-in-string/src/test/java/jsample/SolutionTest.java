package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.solve(new String[]{"ale", "apple", "monkey", "plea"}, "abpcplea"))
                                   .isEqualTo("apple");
        AssertionsForInterfaceTypes.assertThat(solution2.solve(new String[]{"ale", "apple", "monkey", "plea"}, "abpcplea"))
                                   .isEqualTo("apple");
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(
                solution1.solve(new String[]{"pintu", "geeksfor", "geeksgeeks", " forgeek"}, "geeksforgeeks"))
                                   .isEqualTo("geeksgeeks");
        AssertionsForInterfaceTypes.assertThat(
                solution2.solve(new String[]{"pintu", "geeksfor", "geeksgeeks", " forgeek"}, "geeksforgeeks"))
                                   .isEqualTo("geeksgeeks");
    }

}
