package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
