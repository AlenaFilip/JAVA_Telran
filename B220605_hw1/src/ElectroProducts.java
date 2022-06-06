/*Допустим, у нас есть магазин. В нашем магазине есть товары трех категорий: продукты, электроника(мобильные телефоны и ноутбуки), одежда. У каждого товара есть цена и наименование . Каждый товар можно купить (покупателю выставляется счет с цена).

    при покупки продуктов выставляется дополнительная цена за срочность доставки.
    при покупке электроники, покупателю предлагается оформить дополнительную гарантию.
    Телефоны продаются только с контрактом оператора.
    на отдельные категории иногда товаров действует скидка
    Необходимо создать соответствующую структуру классов
 */
public class ElectroProducts extends Shop{
    private String warranty;
    private Boolean handy;

    public ElectroProducts(String name, Double price, String warranty, Boolean handy) {
        super(name, price);
        this.warranty = warranty;
        this.handy = handy;
    }

    public ElectroProducts(String name, Double price, String warranty) {
        super(name, price);
        this.warranty = warranty;
        this.handy = false;
    }

    @Override
    public Double amount(Integer quantity) {
        return super.amount(quantity);
    }

    @Override
    public void buy(Integer quantity) {
        super.buy(quantity);
        System.out.println("----------- warranty "+warranty);
        if (handy) System.out.println("============ make kontract");
    }
}
