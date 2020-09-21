package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void evenTest(int a) {
        Assertions.assertEquals(0, a % 2);
    }

    @ParameterizedTest
    @MethodSource("paramSource")
    void sumTest(int a, int b, int expectedResult) {
        Assertions.assertEquals(expectedResult, a + b);
    }

    private static Stream<Arguments> paramSource() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 3, 5),
                Arguments.of(10, -1, 9)
        );
    }

}
