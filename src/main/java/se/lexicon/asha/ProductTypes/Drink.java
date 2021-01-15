package se.lexicon.asha.ProductTypes;

public class Drink extends Product {
    private String volume;
    public Drink(java.lang.String name, int price, String volume) {
        super(name, price);
        this.volume = volume;
    }

    public Drink(String name, int price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    Product purchase(int money) {
        if (money >= getPrice()) {
            money = money - getPrice();
            return new Drink(getName(), getPrice(), getVolume());
        } else {
            System.out.println("you dont have enough money");
            return null;
        }
    }


    @Override
    String examine() {
        String priceString = Integer.toString(getPrice());
        String productInfo = "Price of product = " + priceString + "name =" + getName() + "Sugar percent=" + getVolume();
        return productInfo;
    }


    @Override
    void use() {
        System.out.println("Product has been used");
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;

    }
}









