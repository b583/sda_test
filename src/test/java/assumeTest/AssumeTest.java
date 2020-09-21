package assumeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumeTest {

    @Test
    void stoppedByAssumeTest() {
        // failed assumption skips tests before failing assertion
        Assumptions.assumeTrue(false);

        Assertions.assertTrue(false);
    }

}
