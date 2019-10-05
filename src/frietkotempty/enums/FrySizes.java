package frietkotempty.enums;

public enum FrySizes {
    SMALL(1.5),
    MEDIUM(2.5),
    BIG(3),
    FAMILY(4.5);

    private double price;

    FrySizes(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
