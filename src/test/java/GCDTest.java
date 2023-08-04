import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void testGCD1(){
        int expected =4;
        int actual = GCD.gcd(8,12);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGCD2(){
        int expected =5;
        int actual = GCD.gcd(5,20);

        Assert.assertEquals(expected,actual);

    }

}