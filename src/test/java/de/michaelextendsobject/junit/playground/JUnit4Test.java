package de.michaelextendsobject.junit.playground;


import org.junit.*;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Tests using JUnit 4.
 */
public class JUnit4Test {

    @BeforeClass
    public static void beforeAll() {
    }

    @Before
    public void beforeEach() {
    }

    @After
    public void afterEach() {
    }

    @AfterClass
    public static void afterAll() {
    }

    @Test
    public void success() {
    }

    @Test
    public void assertionError() {
        assertTrue(false);
    }

    @Test
    public void unexpectedException() throws Exception {
        throw new Exception();
    }

    /**
     * This test will not be executed.
     */
    @Ignore("this test case will not be executed.")
    @Test
    public void doNotRun() {
    }


    @Test(expected = IllegalArgumentException.class)
    public void expectedUncheckedException() {
        try {
            throwIllegalArgumentException();
        } catch (IllegalArgumentException expected) {
            assertEquals("illegal argument", expected.getMessage());
            throw expected; // re-throw expected exception
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectedCheckedException() throws IllegalAccessException {
        thrown.expect(IllegalAccessException.class);
        thrown.expectMessage("illegal access");
        throwIllegalAccessException();
    }

    void throwIllegalArgumentException() {
        throw new IllegalArgumentException("illegal argument");
    }

    void throwIllegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException("illegal access");
    }
}