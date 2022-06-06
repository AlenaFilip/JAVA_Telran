public class Main {
    public static void main(String[] args) {
	    ElectroProducts pc1 = new ElectroProducts("PC 1011", 1240.0, "2 years");
        ElectroProducts hw1 = new ElectroProducts("Huawei 204", 560.0, "1.5 years", true);
        FoodProducts fp1 = new FoodProducts("Jasmine Rice", 2.45);
        FoodProducts fp2 = new FoodProducts("Sausages 500 gr", 3.85);
        Clothes cl1 = new Clothes("Dress ", 152.0);
        Clothes cl2 = new Clothes("Trousers ", 102.0);
        Clothes cl3 = new Clothes("Skirt ", 25.0);

        fp1.buy(2);
        fp2.buy(2);
        cl1.buy(1);
        cl2.buy(1);
        cl3.buy(1);
        pc1.buy(1);
        hw1.buy(1);

    }
}
