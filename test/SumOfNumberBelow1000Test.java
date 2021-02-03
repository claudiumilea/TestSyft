import org.junit.Assert;
import org.junit.Test;


public class SumOfNumberBelow1000Test {

    @Test
    public void testSumOfNumbers() {
        Assert.assertNotNull(SumOfTheNumbersBelow1000.getSum(10));
        Assert.assertEquals(23, SumOfTheNumbersBelow1000.getSum(10));
        Assert.assertEquals(0, SumOfTheNumbersBelow1000.getSum(10001));
        Assert.assertNotEquals(22, SumOfTheNumbersBelow1000.getSum(10));
        Assert.assertEquals(543, SumOfTheNumbersBelow1000.getSum(50));
        Assert.assertEquals(2318, SumOfTheNumbersBelow1000.getSum(100));
        Assert.assertEquals(9168, SumOfTheNumbersBelow1000.getSum(200));
        Assert.assertEquals(20850, SumOfTheNumbersBelow1000.getSum(300));
        Assert.assertEquals(37268, SumOfTheNumbersBelow1000.getSum(400));
        Assert.assertEquals(57918, SumOfTheNumbersBelow1000.getSum(500));
        Assert.assertEquals(83700, SumOfTheNumbersBelow1000.getSum(600));
        Assert.assertEquals(114218, SumOfTheNumbersBelow1000.getSum(700));
        Assert.assertEquals(148668, SumOfTheNumbersBelow1000.getSum(800));
        Assert.assertEquals(188550, SumOfTheNumbersBelow1000.getSum(900));
        Assert.assertEquals(233168, SumOfTheNumbersBelow1000.getSum(1000));

    }
}
