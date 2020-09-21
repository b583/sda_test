package example;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LifecycleTest {

    // add breakpoints inside method bodies to observe lifecycle
    // uncomment TestMethodOrder and Order annotations to force order

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
//    @Order(1)
    void oneTest() {
        System.out.println("Test 1");
        Assertions.assertTrue(true);
    }

    @Test
//    @Order(2)
    void twoTest() {
        System.out.println("Test 2");
        Assertions.assertTrue(true);
    }

    @Test
//    @Order(3)
    void threeTest() {
        System.out.println("Test 3");
        Assertions.assertTrue(true);
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

}
