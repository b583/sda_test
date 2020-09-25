package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class TimeoutTest {

    @Test
    void timeoutWaitingTest() {
        Assertions.assertTimeout(Duration.ofSeconds(3L), this::aLittleBitTooLongOperation);
    }

    private void aLittleBitTooLongOperation() throws InterruptedException {
        Thread.sleep(3500);
    }

    @Test
    void timeoutStopTest() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3L), this::aGiantBlockerBugOperation);
    }

    private void aGiantBlockerBugOperation() throws InterruptedException {
        Thread.sleep(600_000);
    }

}
