/*Imagine you are developing a system for on-line shop (or for a hotel
or for a school or for a hospital or ....... for whatever area you want).
Describe several classes and create objects of these classes
 */
public class Main {

    public static void main(String[] args) {
	    Customer cust1 = new Customer(1, "Anna","Petrova","");
        Product banana = new Product(4, "Banana", "kg", "1.69");
        Product melon = new Product(5,"Melon","stuk", 1.99);
        MyDate dat1 = new MyDate(5,4,2022);
        Orders ord1 = new Orders(4511, dat1, 1,4,1 };
}
