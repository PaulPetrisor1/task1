package task1;

import com.example.matillion.matillion.exception.DifferenceBetweenStringsException;
import com.example.matillion.matillion.task1.service.StringDifference;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class StringDifferenceTest {

    private StringDifference onTest;

    private String firstString;

    private String secondString;

    @Before
    public void setUp() {
        onTest = new StringDifference();
    }

    @Test
    public void test_when_strings_are_same_length() throws DifferenceBetweenStringsException {
        firstString = "abc";
        secondString = "adf";
        int numberOfDifferences = onTest.differenceBetweenTwoStrings(firstString, secondString);
        Assert.assertEquals(numberOfDifferences, 2);
    }

    @Test(expected = DifferenceBetweenStringsException.class)
    public void test_when_strings_are_different_length() throws DifferenceBetweenStringsException {
        firstString = "abcd";
        secondString = "adf";
        onTest.differenceBetweenTwoStrings(firstString, secondString);
    }

    @Test
    public void test_when_strings_are_identical() throws DifferenceBetweenStringsException {
        firstString = "abcdef";
        secondString = "abcdef";
        int numberOfDifferences = onTest.differenceBetweenTwoStrings(firstString, secondString);
        Assert.assertEquals(numberOfDifferences, 0);
    }
}