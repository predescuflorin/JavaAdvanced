package C1;

public class Employee {
    String name;
    int salary;
    int age;

    public int calcBonus() {
        if (age> 40) {return salary*3;}
        if (age>30) {return salary*2;}
        return salary;

    }
}
