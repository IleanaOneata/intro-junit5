package guru.springframework;

import org.junit.jupiter.api.Test;

/**
 * @author ileanaoneata on 14.07.2023
 */
class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld("John"));
    }
}