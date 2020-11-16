package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class OrderedStreamTest {

    @Test
    void test1() {
        OrderedStream orderedStream = new OrderedStream(5);
        AssertionsForInterfaceTypes.assertThat(orderedStream.insert(3, "ccccc")).isEmpty();
        AssertionsForInterfaceTypes.assertThat(orderedStream.insert(1, "aaaaa")).containsExactly("aaaaa");
        AssertionsForInterfaceTypes.assertThat(orderedStream.insert(2, "bbbbb")).containsExactly("bbbbb", "ccccc");
        AssertionsForInterfaceTypes.assertThat(orderedStream.insert(5, "eeeee")).isEmpty();
        AssertionsForInterfaceTypes.assertThat(orderedStream.insert(4, "ddddd")).containsExactly("ddddd", "eeeee");
    }
}
