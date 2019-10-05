package frietkotempty.main;

import frietkotempty.Fryshack;
import frietkotempty.Order;

public class FryMain {

    public static void main(String[] args) {

        Fryshack jammies = new Fryshack("Jammies");
        jammies.makeOrders();

        System.out.println("The current ordernumber is " + Order.getOrderNumber());

    }

}
