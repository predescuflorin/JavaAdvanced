package C1;

public class MainProgram {
    public static void main(String[] args) {
        Employee Bogdan = new Employee();
        Bogdan. name = "Bogdan";
        Bogdan.age = 42;
        Bogdan.salary = 10000;
        Bogdan.calcBonus();
        System.out.println(Bogdan.calcBonus());
    }
}
