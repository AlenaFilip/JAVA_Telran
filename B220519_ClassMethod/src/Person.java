public class Person {
    String name;
    MyDate birthday;

    public Person(String n,MyDate d){
        name=n;
        birthday=d;
    }

    public void print(){
        System.out.println("Person: " +name + " "+birthday.toString());
        System.out.println("The age is: "+ getAge());
    }

    public int getAge(){
        return 2022-birthday.year;
    }
}
