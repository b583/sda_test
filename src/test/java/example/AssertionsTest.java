package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertionsTest {

    @Test
    void moreBasicAssertionsTest() {
        // remember - first expected, then actual
        Assertions.assertEquals(1,1);
        Assertions.assertNotEquals(1, 2);

        // self explaining
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }

}
