public class Orders {
    int number;
    MyDate date;
    int idCustomer;
    int idProducrt;
    double amount ;

    public Orders(int number, MyDate date, int idCustomer, int idProducrt,double amount){
        this.number = number;
        this.date = date;
        this.idCustomer = idCustomer;
        this.idProducrt = idProducrt;
        this.amount = amount;
    }
}
