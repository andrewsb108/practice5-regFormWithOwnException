package immutableObject;

public class Main {
    public static void main(String[] args) {
        Price price = new Price();
        price.setUsualPrice(1000);

        ImmutableStorage immutableStorage = new ImmutableStorage("Samsung_S10", price);

        System.out.println("Title is: " + immutableStorage.getProductTitle() +
                " | " + "Usual price is: " + immutableStorage.getPrice().getUsualPrice() + "\n");

        immutableStorage.setProductTitle("Nokia_A15");
        immutableStorage.setPrice(new Price(700));

        System.out.println("Title is: " + immutableStorage.getProductTitle() +
                " | " + "Usual price is: " + immutableStorage.getPrice().getUsualPrice() + "\n");

        immutableStorage.setProductTitle("Samsung_A8");
        immutableStorage.setPrice(new Price(500));

        System.out.println("Title is: " + immutableStorage.getProductTitle() +
                " | " + "Usual price is: " + immutableStorage.getPrice().getUsualPrice());

    }

}
