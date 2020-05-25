

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WordCountTest.
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class WordCountTest
{
    /**
     * Default constructor for test class WordCountTest
     */
    public WordCountTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void compareToTest()
    {
        WordCount wordCoun1 = new WordCount("a", 23);
        assertEquals(0, wordCoun1.compareTo(new WordCount("a",0)));
    }

    @Test
    public void compareTest_2()
    {
        WordCount wordCoun1 = new WordCount("b", 22);
        assertEquals(-1, wordCoun1.compareTo(new WordCount("c",22)));
    }

    @Test
    public void compareTest_sameSame()
    {
        WordCount wordCoun1 = new WordCount("b", 22);
        assertEquals(0, wordCoun1.compareTo(new WordCount("b",22)));
    }
}



