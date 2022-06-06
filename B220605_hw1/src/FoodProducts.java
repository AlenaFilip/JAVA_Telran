public class FoodProducts extends Shop {
    Integer extra;

    public FoodProducts(String name, Double price) {
        super(name, price);
        this.extra = 0;
    }


    @Override
    public Double amount(Integer quantity) {
        return super.amount(quantity) * (100+extra)/100 ;  // extra charge for food
    }

    @Override
    public void buy(Integer quantity) {
        this.extra = 20;
        System.out.println(getName() + " " + quantity + " pc, price = " + getPrice() + " amount = "
                + amount(quantity) + " (extra "+extra+"% for food) ");
    }
}
