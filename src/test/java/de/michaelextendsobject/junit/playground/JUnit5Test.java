package de.michaelextendsobject.junit.playground;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests using JUnit 5.
 */
@DisplayName("JUnit 5 test cases")
class JUnit5Test {

    @BeforeAll
    static void beforeAll() {
    }

    @BeforeEach
    void beforeEach() {
    }

    @AfterEach
    void afterEach() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void success() {
    }

    @Test
    void assertionError() {
        assertTrue(false);
    }

    @Test
    void unexpectedException() throws Exception {
        throw new Exception();
    }

    /**
     * This test will not be executed.
     */
    @Disabled("this test case will not be executed.")
    @Test
    void doNotRun() {
        // disabled test case
    }

    @Test
    void expectedUncheckedException() {
        IllegalArgumentException expected = expectThrows(IllegalArgumentException.class, () -> throwIllegalArgumentException());
        assertEquals("illegal argument", expected.getMessage());
    }

    @Test
    void expectedCheckedException() {
        IllegalAccessException expected = expectThrows(IllegalAccessException.class, () -> throwIllegalAccessException());
        assertEquals("illegal access", expected.getMessage());
    }

    @DisplayName("test with display name")
    @Test
    void testWithDisplayName() {
    }

    void throwIllegalArgumentException() {
        throw new IllegalArgumentException("illegal argument");
    }

    void throwIllegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException("illegal access");
    }
}