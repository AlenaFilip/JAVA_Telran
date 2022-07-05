/* Создать класс автомобиль, у которого должны быть следующие поля -
модель, год выпуска, цвет.
Создать метод печати, также создать в методе main несколько обьектов класса,
положить их в массив и распечатать */

public class Main {
    public static void main(String[] args) {
        Avto[] avto = new Avto[5];
        avto[0] = new Avto("Cadillac", 1998, "yellow" );
        avto[1] = new Avto("BMW", 2022, "black" );
        avto[2] = new Avto("Honda", 2020, "black" );
        avto[3] = new Avto("Cadillac", 1998, "blue" );
        avto[4] = new Avto("Bugatti", 1998, "gray" );
        for (int i = 0; i < 5; i++) {
            avto[i].print();
        }
    }
}

