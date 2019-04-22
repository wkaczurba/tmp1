import java.math.BigDecimal;
import java.util.Objects;

public final class BasketPrice {
    private final BigDecimal netValue;
    private final BigDecimal grossValue;
    private final BigDecimal taxRate;

    public BigDecimal getNetValue() {
        return netValue;
    }

    public BigDecimal getGrossValue() {
        return grossValue;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public BasketPrice(BigDecimal netValue, BigDecimal grossValue, BigDecimal taxRate) {
        this.netValue = netValue;
        this.grossValue = grossValue;
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketPrice that = (BasketPrice) o;
        return Objects.equals(netValue, that.netValue) &&
                Objects.equals(grossValue, that.grossValue) &&
                Objects.equals(taxRate, that.taxRate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(netValue, grossValue, taxRate);
    }

    @Override
    public String toString() {
        return "BasketPrice{" +
                "netValue=" + netValue +
                ", grossValue=" + grossValue +
                ", taxRate=" + taxRate +
                '}';
    }
}
