import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void testDrinkWater(){
        assertEquals(90, waterBottle.drinkWaterBottle());
    }

    @Test
    public void testEmptyWaterBottle(){
        assertEquals(0, waterBottle.emptyWaterBottle());
    }

    @Test
    public void testFillWaterBottle(){
        assertEquals(100, waterBottle.fillWaterBottle());
    }
}
