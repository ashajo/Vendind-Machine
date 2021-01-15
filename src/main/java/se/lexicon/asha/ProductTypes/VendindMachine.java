package se.lexicon.asha.ProductTypes;

import java.util.ArrayList;


public interface VendindMachine {
    void addMoney(int money);

    Product buy( int prodNum);

    int returnChange();

    void presentProducts(ArrayList<Product> products);

    int getBalance();

    String[] getProduct();
}


