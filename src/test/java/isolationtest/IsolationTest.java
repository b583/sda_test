package isolationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsolationTest {

    private static int sharedResource = 0;

    @Test
    public void isolationTestCaseOne() {
        sharedResource++;
        Assertions.assertEquals(sharedResource, 1);
    }

    /**
     * This test fails due to not being isolated from the other test case (uses static resource)
     */
    @Test
    public void isolationTestCaseTwo() {
        sharedResource++;
        Assertions.assertEquals(sharedResource, 1);
    }

}
