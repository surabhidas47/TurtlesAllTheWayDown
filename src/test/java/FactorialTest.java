import org.junit.Assert;
import org.junit.Test;



public class FactorialTest {

    @Test
    public void testFactorial(){
        long expected =120;
        long actual = Factorial.factorial(5);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testFactorial2(){
        long expected =2;
        long actual = Factorial.factorial(2);

        Assert.assertEquals(expected,actual);

    }


}