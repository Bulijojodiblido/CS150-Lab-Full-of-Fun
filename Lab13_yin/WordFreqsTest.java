
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WordFreqsTest.
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class WordFreqsTest
{
    TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();

    /**
     * Default constructor for test class WordFreqsTest
     */
    public WordFreqsTest()
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
        treeMult1.add("b");
        treeMult1.add("b");
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.add("a");
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
    public void mostCommonTest_1(){
        WordFreqs w = new WordFreqs(treeMult1);
        String a = w.mostCommon(1).toString();
        String b = "[a 4]";
        assertEquals(a,b);
    }
    
    @Test
    public void mostCommonTest_2(){
        WordFreqs w = new WordFreqs(treeMult1);
        String a = w.mostCommon(2).toString();
        String b = "[a 4, b 2]";
        assertEquals(a,b);
    }
    
    @Test
    public void mostCommonTest_Empty(){
        WordFreqs w = new WordFreqs(new TreeMultiSet<String>());
        String a = w.mostCommon(2).toString();
        String b = "[]";
        assertEquals(a,b);
    }
}
