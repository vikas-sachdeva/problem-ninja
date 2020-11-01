package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void solveTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(0, 0, 0)).isZero();
    }

    @Test
    void solveTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(1, 0, 0)).isOne();
    }

    @Test
    void solveTest3() {
        int poured = 2;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isEqualTo(0.5);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isEqualTo(0.5);
    }

    @Test
    void solveTest4() {
        AssertionsForInterfaceTypes.assertThat(solution.solve(2, 2, 0)).isZero();
    }

    @Test
    void solveTest5() {
        int poured = 3;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isOne();
    }

    @Test
    void solveTest6() {
        int poured = 4;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 0)).isEqualTo(0.25);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 1)).isEqualTo(0.5);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 2)).isEqualTo(0.25);
    }

    @Test
    void solveTest7() {
        int poured = 5;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 0)).isEqualTo(0.5);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 1)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 2)).isEqualTo(0.5);
    }

    @Test
    void solveTest8() {
        int poured = 6;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 0)).isEqualTo(0.75);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 1)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 2)).isEqualTo(0.75);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 3, 1)).isEqualTo(0.25);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 3, 2)).isEqualTo(0.25);
    }

    @Test
    void solveTest9() {
        int poured = 7;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 0, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 0)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 1, 1)).isOne();
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 0)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 1)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 2, 2)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 3, 1)).isEqualTo(0.5);
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 3, 2)).isEqualTo(0.5);
    }

    @Test
    void solveTest10() {
        int poured = 100000009;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 33, 17)).isOne();
    }

    @Test
    void solveTest11() {
        int poured = 1000000000;
        AssertionsForInterfaceTypes.assertThat(solution.solve(poured, 99, 99)).isZero();
    }

}
