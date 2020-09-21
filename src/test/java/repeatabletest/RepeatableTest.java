package repeatabletest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class RepeatableTest {

    @Test
    void nonRepeatableTest() {
        Assertions.assertTrue(new Random().nextBoolean());
    }

}
