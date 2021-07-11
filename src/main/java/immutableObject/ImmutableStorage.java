package immutableObject;

public final class ImmutableStorage {
    private final String productTitle;
    private final Price price;

    public ImmutableStorage(String productTitle, Price price) {
        this.productTitle = productTitle;
        Price clonePrice = new Price();
        clonePrice.setUsualPrice(price.getUsualPrice());
        this.price = price;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public Price getPrice() {
        Price clonePrice = new Price();
        clonePrice.setUsualPrice(this.price.getUsualPrice());
        return clonePrice;
    }

    public ImmutableStorage setProductTitle(String productTitle) {
        return new ImmutableStorage(productTitle, this.price);
    }

    public ImmutableStorage setPrice(Price price) {
        return new ImmutableStorage(this.productTitle, price);
    }
}
