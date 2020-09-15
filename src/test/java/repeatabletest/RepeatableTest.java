package repeatabletest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RepeatableTest {

    @Test
    public void nonRepeatableTest() {
        Assertions.assertTrue(new Random().nextBoolean());
    }

}
