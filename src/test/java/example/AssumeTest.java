package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumeTest {

    @Test
    void windowsExclusiveTest() {
        // failed assumption skips tests before failing assertion
        Assumptions.assumeTrue("WINDOWS".equals(getOS()));

        Assertions.assertTrue(false);
    }

    private String getOS() {
        return "LINUX";
    }

}
