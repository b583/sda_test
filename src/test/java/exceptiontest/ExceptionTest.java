package exceptiontest;

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

    private static class ExampleException extends Exception {

    }

}
