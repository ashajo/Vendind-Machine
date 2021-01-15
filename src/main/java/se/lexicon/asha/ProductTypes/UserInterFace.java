package se.lexicon.asha.ProductTypes;


import java.util.ArrayList;



public class UserInterFace {

    public UserInterFace() {
        super();
    }

    public static void main(java.lang.String[] args) {

        VendindMachine VendindMachine = new VendindMachine() {
            @Override
            public void addMoney(int money) {

            }

            @Override
            public Product buy(int prodNum) {
                return null;
            }

            @Override
            public int returnChange() {
                return 0;
            }

            @Override
            public void presentProducts(ArrayList<Product> products) {

            }

            @Override
            public int getBalance() {
                return 0;
            }

            @Override
            public String[] getProduct() {
                return new String[0];
            }

        };
//VendingMachine.presentProduct();
    }
}