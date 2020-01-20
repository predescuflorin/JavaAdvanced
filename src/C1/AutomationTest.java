package C1;

import org.junit.Assert;
import org.junit.Test;

public class AutomationTest {

    @Test
    public void scenariu1() {
        Employee e = new Employee();
        e.name = "Bogdan";
        e.age = 45;
        e.salary = 5000;
        int bonus = e.calcBonus();
        Assert.assertEquals(15000, bonus);
    }
    @Test
    public void scenariu2 () {
        Employee el = new Employee();
        el.name = "Ionut";
        el.age = 22;
        el. salary = 2000;
        int bonus = el.calcBonus();
        Assert.assertEquals(2000, bonus);
    }
}
