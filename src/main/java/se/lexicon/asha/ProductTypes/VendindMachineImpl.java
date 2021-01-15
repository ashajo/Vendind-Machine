package se.lexicon.asha.ProductTypes;


import java.util.ArrayList;

public class VendindMachineImpl implements VendindMachine {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> denominations = new ArrayList<>();
    int moneyPool;

    Drink water = new Drink("MineralWater", 10, "25cl");
    Snack cookie = new Snack("chocolatecookie", 20, 30);
    Food sandwich = new Food("ChickenSandwich", 40, 35);


    public VendindMachineImpl() {
        denominations.add(1);
        denominations.add(2);
        denominations.add(5);
        denominations.add(10);
        denominations.add(20);
        denominations.add(50);
        denominations.add(100);
        denominations.add(200);
        denominations.add(500);
        denominations.add(1000);

        products.add(water);
        products.add(cookie);
        products.add(sandwich);

        this.moneyPool = 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void addMoney(int money) {
        if (denominations.contains(money)) {
            moneyPool += money;
        } else {
            System.out.println("Denomination is not available");
        }
        System.out.println("Your Moneypool is " + moneyPool);

    }


    @Override
    public Product buy(int prodNum) {
        int productPrice = products.get(prodNum).getPrice();
        if (moneyPool >= productPrice) {
            moneyPool -= productPrice;
            System.out.println("Your moneypool is " + moneyPool);
            return products.get(prodNum);
        } else {
            System.out.println("You dont have enough Money");
        }
        return null;
    }


    @Override
    public int returnChange() {
        int change = moneyPool;
        moneyPool = change;
        System.out.println("Your change is " + change);
        return change;
    }

    @Override
    public void presentProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++)
            System.out.println("Product Number is" + products.get(i).getName());
    }


    @Override
    public int getBalance() {
        return moneyPool;
    }


    @Override
    public String[] getProduct() {
        return new String[0];
    }

}






