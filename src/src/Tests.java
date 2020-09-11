import org.junit.Assert;
import org.testng.annotations.Test;

public class Tests {
    BinaryCalculation c = new BinaryCalculation();

    @Test
    public void testIfInputTerminal() {

    }

    @Test
    public void testReset() {
        //TODO: Implement Test
    }

    @Test
    public void testCalculate() {
        /*
        Assert.fail();
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

    @Test
    public void testSetOperation() {
        //TODO: Implement Test
    }
}