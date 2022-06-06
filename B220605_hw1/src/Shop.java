import org.w3c.dom.ls.LSOutput;

public abstract class Shop {
    private String name;
    private Double price;

    public Shop(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double amount(Integer quantity){
        return getPrice()*quantity;
    }
     public void buy(Integer quantity) {
        System.out.println(getName()+" "+quantity+" pc, price = "+getPrice() + " amount = "+amount(quantity));
    }
}
