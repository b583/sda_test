package assumeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumeTest {

    @Test
    public void stoppedByAssumeTest() {
        // failed assumption skips tests before failing assertion
        Assumptions.assumeTrue(false);

        Assertions.assertTrue(false);
    }

}
