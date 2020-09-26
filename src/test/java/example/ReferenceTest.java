package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReferenceTest {

    @Test
    void referenceTest() {
        final var dummyOne = new DummyClass();
        final var dummyTwo = new DummyClass();

        Assertions.assertSame(dummyOne, dummyTwo);
    }

    private static class DummyClass {

    }

    @Test
    void boxedValueReferenceTest() {
        // see that test succeeds due to Integer using cache for valueOf method
        final var int1 = Integer.valueOf(1);
        final var int2 = Integer.valueOf(1);

        Assertions.assertSame(int1, int2);
    }

}
