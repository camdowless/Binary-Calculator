import org.junit.Assert;
import org.junit.Test;

public class Tests {
    BinaryCalculation c = new BinaryCalculation();

   

    @Test
    public void testReset() {
        c.reset();
        Assert.assertNotNull(c);
    }

    @Test
    public void testCalculate() {
        /*
        c.calculate(c.setN1("0101")) + (c.setN2("1110"));
        Assert.assertEquals(c.calculate(), "10000");
        */
    }

    @Test
    public void testSetN1() {
        c.setN1("0011");
        Assert.assertEquals(c.getN1(), 3);
    }

    @Test
    public void testSetN2() {
        c.setN2("0011");
        Assert.assertEquals(c.getN2(), 3);
    }

   
}
