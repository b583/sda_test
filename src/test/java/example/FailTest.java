package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailTest {

    @Test
    void failTest() {

        // test is failed before assertion is reached
        Assertions.fail("Failed by programmer");
        // if you feel like you need to use it you might have a bad test

        // MUST be a success
        Assertions.assertTrue(true);
    }

}
