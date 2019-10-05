package frietkotempty;

import frietkotempty.condiments.Sauce;
import frietkotempty.drinks.*;
import frietkotempty.enums.FrySizes;
import frietkotempty.foods.Fries;
import frietkotempty.interfaces.Orderable;

import java.text.DecimalFormat;
import java.util.Random;

public class Fryshack {
    private String name;

    public Fryshack(String string) {
        this.name = string;
    }

    public String getName() {
        return name;
    }

    public void makeOrders() {
        makeOrderOne();
        makeOrderTwo();
        makeOrderThree();
        makeOrderFour();
        System.out.println("The amount of fries portions made: " + Fries.portionCount);
    }

    // make an order by making Fries, Sauce and Drink Objects and setting them with
    // their Setters
    private void makeOrderOne() {
        Fries friet1 = new Fries();
        friet1.setSize(FrySizes.BIG);
        Fries friet2 = new Fries();
        friet2.setSize(FrySizes.MEDIUM);
        Sauce mayo = new Sauce();
        mayo.setName("mayonaise");
        Sauce ketch = new Sauce();
        ketch.setName("ketchup");
        Water drank1 = new Water();
        Soda drank2 = new Soda();
        Order order1 = new Order();
        order1.addToOrder(friet1);
        order1.addToOrder(friet2);
        order1.addToOrder(mayo);
        order1.addToOrder(ketch);
        order1.addToOrder(drank1);
        order1.addToOrder(drank2);
        order1.fryOrder();
        System.out.println("The total price for this order is " + (new DecimalFormat("#.00")).format(order1.CalculateTotalPrice()) + "€\n");
    }

    // make an order by making new Fries, Sauce and Drink Objects and setting them
    // with their Constructors
    private void makeOrderTwo() {
        Fries friet1 = new Fries(FrySizes.FAMILY);
        Sauce mayo1 = new Sauce("mayonaise");
        Sauce mayo2 = new Sauce("mayonaise");
        Sauce ketchup = new Sauce("ketchup");
        Water water = new Water();
        Soda soda1 = new Soda();
        Soda soda2 = new Soda();
        Soda soda3 = new Soda();
        Order order2 = new Order();
        order2.addToOrder(friet1);
        order2.addToOrder(mayo1);
        order2.addToOrder(mayo2);
        order2.addToOrder(ketchup);
        order2.addToOrder(water);
        order2.addToOrder(soda1);
        order2.addToOrder(soda2);
        order2.addToOrder(soda3);
        order2.fryOrder();
        System.out.println("The total price for this order is " + (new DecimalFormat("#.00")).format(order2.CalculateTotalPrice()) + "€\n");
    }

    // make an onlineOrder with an Orderable array
    private void makeOrderThree() {
        Order order3 = new Order();
        order3.setOrders(new Orderable[]{new Fries(FrySizes.BIG), new Sauce("mayonaise"), new Beer()});
        order3.fryOrder();
        System.out.println("The total price for this order is " + (new DecimalFormat("#.00")).format(order3.CalculateTotalPrice()) + "€\n");

    }

    // make an your own Order
    private void makeOrderFour() {
        Order order4 = new Order();
        boolean flag = false;
        while (flag != true) {
            Random rand = new Random();
            int choice = rand.nextInt(9);
            switch (choice) {
                case 0:
                    order4.addToOrder(new Fries(FrySizes.FAMILY));
                    break;
                case 1:
                    order4.addToOrder(new Fries(FrySizes.BIG));
                    break;
                case 2:
                    order4.addToOrder(new Fries(FrySizes.MEDIUM));
                    break;
                case 3:
                    order4.addToOrder(new Fries(FrySizes.SMALL));
                    break;
                case 4:
                    order4.addToOrder(new Sauce("ketchup"));
                    break;
                case 5:
                    order4.addToOrder(new Sauce("mayonaise"));
                    break;
                case 6:
                    order4.addToOrder(new Water());
                    break;
                case 7:
                    order4.addToOrder(new Soda());
                    break;
                case 8:
                    order4.addToOrder(new Beer());
                    break;
            }
            if (order4.CalculateTotalPrice() >= 10) {
                flag = true;
            }
        }

        order4.fryOrder();
        System.out.println("The total price for this order is " + (new DecimalFormat("#.00")).format(order4.CalculateTotalPrice()) + "€\n");
    }

}

