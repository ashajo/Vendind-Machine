package se.lexicon.asha.ProductTypes;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        VendindMachine vendindMachine;
        //instance of the class
        //Drink drink = new Drink("MineralWater", 10, "25cl");
        //
        //System.out.println(drink.examine());
        // System.out.println((drink.purchase(1)));

        // Food food = new Food("ChikenSandwich",40,35);
        //System.out.println((food.examine());

        // System.out.println((food.purchase(50));

        // Snack snack = new Snack("chocolatecookie",20,30);
        // System.out.println(snack.examine());
        // System.out.println(snack.purchase(100));

        vendindMachine = new VendindMachineImpl();

        vendindMachine.addMoney(100);
        vendindMachine.buy(1);
        vendindMachine.buy(2);
        vendindMachine.addMoney(200);
        vendindMachine.buy(2);
        vendindMachine.returnChange();
        vendindMachine.buy(2);


      //  vendindMachine.buy();
       // vendindMachine.presentProducts();
       // vendindMachine.getBalance();
       // vendindMachine.returnChange();
    }
}
