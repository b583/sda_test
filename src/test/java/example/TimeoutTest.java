package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class TimeoutTest {

    @Test
    void timeoutWaitingTest() {
        Assertions.assertTimeout(Duration.ofSeconds(3L), () -> {
            Thread.sleep(3500);
        });
    }

    @Test
    void timeoutStopTest() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3L), () -> {
            Thread.sleep(600_000);
        });
    }

}
