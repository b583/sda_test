package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AssertionsTest {

    @Test
    void moreBasicAssertionsTest() {
        // remember - first expected, then actual
        Assertions.assertEquals(1, sum(0, 1));
        Assertions.assertNotEquals(1, sum(3, -1));

        // self explaining
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }

    private int sum(int a, int b) {
        return a + b;
    }

    @Test
    void testArrays() {
        // test array content
        final int[] arrayOne = {1, 2, 3};
        final int[] arrayTwo = {1, 2, 3};
        Assertions.assertArrayEquals(arrayOne, arrayTwo);
    }

    @Test
    void testIterables() {
        // test iterable content e.g. lists
        final var listOne = List.of("A", "B", "C");
        final var listTwo = List.of("A", "B", "C");
        Assertions.assertIterableEquals(listOne, listTwo);
    }

}
