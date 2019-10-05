package frietkotempty.condiments;
import frietkotempty.interfaces.Orderable;

public class Sauce implements Orderable {
    private final double price = 0.80;
    private String name;

    public Sauce(String name){
        setName(name);
    }

    public Sauce(){
        this("");
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
