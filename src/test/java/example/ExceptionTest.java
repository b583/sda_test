package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

    @Test
    void exampleExceptionIsThrown() {
        Assertions.assertThrows(ExampleException.class, () -> {
            // tested code
            throw new ExampleException();
        });
    }

    @Test
    void exampleExceptionIsNotThrown() {
        Assertions.assertDoesNotThrow(() -> {
            // tested code
        });
    }

    private static class ExampleException extends Exception {

    }

}
