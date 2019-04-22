import java.math.BigDecimal;

public class SimplePriceCalculator implements BasketPriceCalculator {

    // net, gross,
    // vat on items. -> need to rework Item (abstract)
    //  all items are same VAT range.

    // Taxation
    private BigDecimal vatRate = new BigDecimal(1.22);

    public BasketPrice getBasketValue(Basket basket) {
        BigDecimal netValue = new BigDecimal(0);
        BigDecimal grossValue;

        for (Item item : basket.getItems()) {
            netValue = netValue.add(item.getUnitPrice());
        }

        grossValue = netValue.multiply(vatRate).setScale(2);

        return new BasketPrice(netValue, grossValue, vatRate);
    }

}
