import java.util.Arrays;

public class EmployeeTeam {

    private Employee[] team;
    int currentIndex = 0;
    int capacity = 2;

    public EmployeeTeam(int capacity) {
        this.capacity = capacity;
    }
    public EmployeeTeam(){

    }



    public void add (Employee e) {
        if (team == null) {
            team = new Employee[capacity]; //
            currentIndex = 0;
        }
        if (currentIndex >= capacity) {
            capacity *= 2;
            team = Arrays.copyOf(team, capacity); //указываем, откуда хотим копировать и задаем длину
        }
        team[currentIndex++] = e;//currentIndex - адрес той ячйки, в которую мы будем что-то добавлять, null. Адрес ячйки, где закончились данные.
        //Если будем добавлять, то будем добавлять в эту ячейку. Эта ячейка = currentIndex
        //Добавили элемент и сдвинули currentIndex на след.ячейки
    }


    public void print(){
        System.out.println("Team: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(i + ": " + team[i] + "   ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Team{ " + Arrays.toString(team) + "}";
    }


    public int findEmployee(Employee employee){
        if (employee != null)
            for (int i = 0; i < currentIndex; i++) {
                if(team[i] != null &&
                        team[i].hashCode() == employee.hashCode() &&
                        team[i].equals(employee))
                    return i;
            }
        return -1;
    }

    public void remove(int index) {
        if (currentIndex > 0 && index <= currentIndex) {
            System.arraycopy(team, index + 1, team, index, capacity - 1 - index);
            currentIndex--;
        }
    }

    public void remove (int index, boolean flag){
        if(flag){
            System.out.println("remove element" + index);
        }
        remove(index);


    }
    public void remove(Employee employee){
        int index = findEmployee(employee);
        if(index != -1){
            remove(index);
        }

    }

    // The int size() method that returns how many Employees there are in the team
    public int size(){
        return currentIndex;
    }
    //The Employee get(int index) method which returns the Employee with the given index
    public Employee get(int index){
        if(index > 0 && index < currentIndex){
            return team[index];
        }else{
            return null;
        }
    }

    //The remove (String name) method that remove Employees by the name
    public void remove(String name){
    }
    // Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public boolean removeAll(Employee[] employees){
        int size = size();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                remove(employees[i]); //вызываем метод remove c его параметрами
            }
        }
        return size != size();
    }
    public boolean removeAll(EmployeeTeam employees){
        if(employees == null) return false;
        int size = size();
        for (int i = 0; i < employees.size(); i++) {
            Employee e = get(i); //берем работника по индексу, метод выше
            if(e != null){
                remove(e);
            }
        }
        return  size != size(); //сравниваем, остался ли размер таким же, как и был
    }
    //Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public boolean addAll(Employee[] employees){
        int size = size();
        if (employees == null) return false;
        int newCapacity = currentIndex + employees.length+10;
        if(newCapacity < capacity){
            increaseToSize(newCapacity);
        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                add(employees[i]);
            }
        }
        return size == size();
    }
    public boolean addAll(EmployeeTeam employees){
        if(employees != null){
            return addAll(employees.getTeam());//гетер вернет свех рабоников, которые лежат в EmployeeTeam. Возвр.массив team
        }else{
            return false;
        }
    }
    public void increaseToSize(int newCapacity){
        if(newCapacity > capacity){
            team = Arrays.copyOf(team, newCapacity);//создает массив увеличенного размера
            capacity = newCapacity; //записывает, что новый размер массива вот такой
        }
    }
    public Employee[] getTeam(){
        return team;
    }
    // Since our EmployeeTeam allows null cells at the end of the array, it could takes up extra memory. Implement
    // the trimToSize() method that trims the capacity of the array to be the real current size.

    public void trimToSize(){
        if (capacity > currentIndex){
            team = Arrays.copyOf(team, currentIndex);
            capacity = currentIndex;
        }
    }
    // The method that returns the new EmployeeTeam with
    // all employees with the given name from this team .

    public EmployeeTeam findByName(String name){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        if(name == null) return employeeTeam;
        for (int i = 0; i < currentIndex; i++) {
            if(team[i].getName().equals(name)){
                employeeTeam.add(team[i]);
            }
        }
        return employeeTeam;
    }
    // Implement the method that returns the
    // EmployeeTeam with all programmers or all QA Engineers from this team
    public EmployeeTeam findAllBySpeciality(String name){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        if(name == null) return employeeTeam;
        for (int i = 0; i < currentIndex; i++) {
            switch(name){
                case "programmer":
                    if (team[i] instanceof Programmer) add(team[i]);
                case "qa":
                    if (team[i] instanceof QAEngineer) add (team[i]);
            }
        }
        return employeeTeam;
    }


    public void setTeam(Employee[] team) {
        this.team = team;
    }
}



    /*
    public void remove1 (int n){
        Employee [] arr1 = new Employee[n];
        Employee[] arr2 = new Employee[team.length-n];
        Employee[] dest = new Employee[team.length-1];
        arr1 = Arrays.copyOfRange(team,0,n);
        arr2 = Arrays.copyOfRange(team, n+1, team.length);
        System.arraycopy(arr1, 0, dest, 0, arr1.length);
        System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);
        team = Arrays.copyOf(dest,team.length-1 );
        currentIndex--;
    }
 */