package immutableObject;

public class Price {
    long usualPrice;

    public Price() {
    }

    public Price(long usualPrice) {
        this.usualPrice = usualPrice;
    }

    public long getUsualPrice() {
        return usualPrice;
    }

    public void setUsualPrice(long usualPrice) {
        this.usualPrice = usualPrice;
    }
}
