import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {
    @Test
    public void evenNumberTest() {
        Assert.assertEquals("", true, EvenOddChecker.check(8));
    }
    @Test

    public void nullTest() {
        Assert.assertEquals("", true, EvenOddChecker.check(0));
    }
    @Test
    public void oddNumberTest() {
        Assert.assertEquals("", false, EvenOddChecker.check(17));
    }
}
