package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("SDA")
class TaggedTest {

    // to run call mvn test -Dgroups=SDA

    @Test
    void taggedTest() {
        Assertions.assertTrue(true);
    }

}
