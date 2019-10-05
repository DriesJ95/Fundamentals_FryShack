package frietkotempty.foods;
import frietkotempty.enums.FrySizes;
import frietkotempty.interfaces.Fryable;
import frietkotempty.interfaces.Orderable;

public class Fries implements Fryable, Orderable {

    private double price;
    private FrySizes size;
    public static int portionCount;

    public Fries(FrySizes size){
        this.size = size;
        portionCount++;
    }

    public void getPortionCount(){
        System.out.println("There have been " + portionCount + " of fries made");
    }

    public Fries(){
        this(null);
    }

    public void setSize(FrySizes size){
        this.size = size;
    }

    public void fry(){
        System.out.println("Smijt een " + this.size.name().toLowerCase() + " portie in de frietpot");
    }


    @Override
    public double getPrice() {
        calculatePrice();
        return price;
    }

    public void calculatePrice(){
        this.price = size.getPrice();
    }
}
