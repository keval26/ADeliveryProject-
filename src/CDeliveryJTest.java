import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class CDeliveryJTest {
	CDelivery Cobj = new CDelivery();

	@Test
	public void PriceForDistanceLessThan10KM() {
		Assert.assertEquals(10, Cobj.PriceForDistance(8));

	}

	@Test
	public void PriceForDistanceGreaterThan10KM() {
		Assert.assertEquals(25, Cobj.PriceForDistance(12));
	}

	@Test
	public void PriceForDistanceLessThan10KMAndStirs() {
		Assert.assertEquals(20, Cobj.PriceForDistanceAndStairs(7));

	}

	@Test
	public void PriceForDistanceGreaterThan10KMAndStirs() {
		Assert.assertEquals(35, Cobj.PriceForDistanceAndStairs(15));
	}

	@Test
	public void deliveryPriceForWeekend() {
		Assert.assertEquals(50, Cobj.Weekend());

	}
	
	
	}
