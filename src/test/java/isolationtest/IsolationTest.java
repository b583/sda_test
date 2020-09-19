package isolationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsolationTest {

    // remove the 'static' keyword to fix the issue
    private static int sharedResource = 0;

    @Test
    public void isolationTestCaseOne() {
        sharedResource++;
        Assertions.assertEquals(1, sharedResource);
    }

    /**
     * This test fails due to not being isolated from the other test case (uses static resource)
     */
    @Test
    public void isolationTestCaseTwo() {
        sharedResource++;
        Assertions.assertEquals(1, sharedResource);
    }

}
