public class Person implements Comparable<Person> {
//public class Person {
    String firstName;
    String lastName;
    int age;

    @Override
    public int compareTo(Person person) {
        return (this.age - person.age);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " "+ lastName + " : " + age ;
    }
}
