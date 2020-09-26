package example.multi;


import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class MultiAssertJTest {

    @Test
    void assertJTest() {

        final var jan = new Person("Jan", "Kowalski");

        // note that if any assertion fails the rest is not executed
        Assertions.assertThat(jan.getFullName())
                .as("Full name syntax is name + space + last name")
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
    }

    @Test
    void assertJSoftTest() {
        final var jan = new Person("Jan", "Kowalski");

        final var softAssertions = new SoftAssertions();
        softAssertions.assertThat(jan.getFullName())
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
        softAssertions.assertAll(); // careful! assertions are not executed without this line
    }

}
