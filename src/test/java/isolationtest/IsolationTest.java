package isolationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsolationTest {

    // remove the 'static' keyword to fix the issue
    private static int sharedResource = 0;

    @Test
    void isolationTestCaseOne() {
        sharedResource++;
        Assertions.assertEquals(1, sharedResource);
    }

    /**
     * This test fails due to not being isolated from the other test case (uses static resource)
     */
    @Test
    void isolationTestCaseTwo() {
        sharedResource++;
        Assertions.assertEquals(1, sharedResource);
    }

}
