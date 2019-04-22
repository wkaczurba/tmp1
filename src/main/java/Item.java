import java.math.BigDecimal;
import java.util.Objects;

public final class Item {

    private final String name;
    private final BigDecimal unitPrice;

    public Item(String name, BigDecimal unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(unitPrice, item.unitPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, unitPrice);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

