package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve("A*(B+C)/D")).isEqualTo("ABC+*D/");
        AssertionsForInterfaceTypes.assertThat(solution.solve("a+b*(c^d-e)^(f+g*h)-i")).isEqualTo("abcd^e-fgh*+^*+i-");
        AssertionsForInterfaceTypes.assertThat(solution.solve("K+L-M*N+(O^P)*W/U/V*T+Q")).isEqualTo("KL+MN*-OP^W*U/V/T*+Q+");
        AssertionsForInterfaceTypes.assertThat(solution.solve("K+L-M*N+(O^P)*W/U/V*T+Q^J^A")).isEqualTo("KL+MN*-OP^W*U/V/T*+QJA^^+");
    }
}
