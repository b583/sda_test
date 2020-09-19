package taggedtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("SDA")
public class TaggedTest {

    // to run call mvn test -Dgroups=SDA

    @Test
    public void taggedTest() {
        Assertions.assertTrue(true);
    }

}
