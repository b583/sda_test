package testlifecycle;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {

    // add breakpoints inside method bodies to observe lifecycle
    // uncomment TestMethodOrder and Order annotations to force order

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
//    @Order(1)
    public void oneTest() {
        System.out.println("Test1");
    }

    @Test
//    @Order(2)
    public void twoTest() {
        System.out.println("Test2");
    }

    @Test
//    @Order(3)
    public void threeTest() {
        System.out.println("Test3");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

}
