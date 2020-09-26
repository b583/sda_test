package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicTest {

    @Test
    void basicTest() {
        // arrange
        final var greeter = new Greeter();

        // act
        final var msg = greeter.getHelloMessage();

        // assert
        Assertions.assertFalse(msg.isEmpty());
    }

    private static class Greeter {

        private String getHelloMessage() {
            return "Hello JUnit!";
        }

    }

}
