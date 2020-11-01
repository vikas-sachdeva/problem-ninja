package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void countTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.count(4)).isEqualTo(7);
        AssertionsForInterfaceTypes.assertThat(solution.count(3)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(solution.count(5)).isEqualTo(13);
    }
}
