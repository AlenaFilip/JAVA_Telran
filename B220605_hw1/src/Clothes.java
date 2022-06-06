public class Clothes extends Shop{
    Integer discount;

    public Clothes(String name, Double price) {
        super(name, price);
        discount = 0;
    }

    @Override
    public Double amount(Integer quantity) {
        return super.amount(quantity) * (100 - discount)/100;  // extra charge for food
    }

    @Override
    public void buy(Integer quantity) {
        if (getName().contains("Dress")) discount = 10;
        if (getName().contains("Skirt")) discount = 15;
        System.out.println(getName() + " " + quantity + " pc, price = " + getPrice()
                + " amount = " + amount(quantity) + ((discount == 0)? "":" (discount = "+discount) + ")");
    }
}
