import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SimplePriceCalculatorTest {

    SimplePriceCalculator simplePriceCalculator;

    @Before
    public void setup() {
        simplePriceCalculator = new SimplePriceCalculator();
    }

    @Test
    public void name() {
        Basket basket = new Basket();

        assertEquals(BigDecimal.ZERO, simplePriceCalculator.getBasketValue(new Basket()).getGrossValue().to);
        assertEquals(BigDecimal.ZERO, simplePriceCalculator.getBasketValue(new Basket()).getNetValue());
        assertEquals(new BigDecimal(1.22), simplePriceCalculator.getBasketValue(new Basket()).getTaxRate());
    }
}

// Integer in cents
//   Value class (money) => with simple
