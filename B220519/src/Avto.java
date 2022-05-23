public class Avto {
    String model;
    int year;
    String color;

    public Avto(String m, int y, String c){
        model = m;
        year = y;
        color = c;
    }

    public void print(){
        System.out.println("Automobile: " + model+ " " + color);
        System.out.println("Year of release: " + year);
    }
}

/* Создать класс автомобиль, у которого должны быть следующие поля -
модель, год выпуска, цвет.
Создать метод печати, также создать в методе main несколько обьектов класса,
положить их в массив и распечатать */