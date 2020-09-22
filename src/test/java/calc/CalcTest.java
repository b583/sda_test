package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void sumTest() {
        Assertions.assertEquals(5, new Calc().sum(2, 3));
    }

}
