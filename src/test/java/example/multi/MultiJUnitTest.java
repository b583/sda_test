package example.multi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MultiJUnitTest {

    @Test
    @DisplayName("Full name syntax is name + space + last name")
    void checkPerson() {
        final var fullName = new Person("Jan", "Kowalski").getFullName();

        Assertions.assertAll(
                () -> Assertions.assertTrue(fullName.startsWith("Jan"),
                        "Full name starts with Jan"),
                () -> Assertions.assertTrue(fullName.contains(" "),
                        "There is whitespace between name and last name"),
                () -> Assertions.assertTrue(fullName.endsWith("Kowalski"),
                        "Full name ends with Kowalski")
        );
    }

}
