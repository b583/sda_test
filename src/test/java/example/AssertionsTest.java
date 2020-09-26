package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        final int[] array = {1, 3, 2};
        Arrays.sort(array);

        Assertions.assertArrayEquals(new int[] {1, 2, 3}, array);
    }

    @Test
    void testIterables() {
        final var list = new ArrayList<>(List.of("A", "C", "B"));
        list.sort(Comparator.naturalOrder());

        Assertions.assertIterableEquals(List.of("A", "B", "C"), list);
    }

}
