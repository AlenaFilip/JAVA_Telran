public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year ){
        this.month= month;
        this.day = day;
        this.year=year;
    }


    public void print(){
        System.out.println(year+"-"+month+"-"+day);

    }

    public String toString(){
        String str = year+"-"+month+"-"+day;
        return str;
    }


}
