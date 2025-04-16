package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    /**
     * Test the hello world string
     */
    @Test    public void testHelloWorld() {
        String hello = "Hello, World!";
        assertEquals(13, hello.length());
    }
}
