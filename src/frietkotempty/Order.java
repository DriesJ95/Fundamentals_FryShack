package frietkotempty;

import frietkotempty.foods.Fries;
import frietkotempty.interfaces.Orderable;

public class Order {
    private Orderable[] orders = new Orderable[0];
    private static int orderCount;

    public double CalculateTotalPrice() {
        double totalP = 0;
        for (Orderable o : orders){
            totalP += o.getPrice();
        }
        return totalP;
    }

    //Put everything in fryer
    public void fryOrder() {
        System.out.println("|Order number " + (orderCount+1) + " is being prepared|");
        for (Orderable o : orders){
            if (o instanceof Fries){
                ((Fries) o).fry();
            }
        }
        ++orderCount;
    }

    public void addToOrder(Orderable order){
        Orderable[] temp = new Orderable[orders.length + 1];
        for (int i = 0; i < orders.length; i++) {
            temp[i] = orders[i];
        }
        temp[orders.length] = order;
        orders = temp;
    }

    public void setOrders(Orderable[] orders){
        this.orders = orders;
    }

    public static int getOrderNumber() {
        return orderCount;
    }
}
