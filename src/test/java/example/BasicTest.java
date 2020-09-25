package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicTest {

    @Test
    void basicTest() {
        Assertions.assertFalse(getHelloMessage().isEmpty());
    }

    private String getHelloMessage() {
        return "Hello JUnit!";
    }

}
