package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailTest {

    @Test
    void failTest() {

        // test is failed before assertion is reached
        Assertions.fail("Failed by programmer");
        // to be honest I don't see a use case for this beside not implemented test

        // MUST be a success
        Assertions.assertTrue(true);
    }

}
