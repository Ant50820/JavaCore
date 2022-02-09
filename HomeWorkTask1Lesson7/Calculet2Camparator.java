package HomeWorkTask1Lesson7;

import java.util.Comparator;

public class Calculet2Camparator implements Comparator <SalarieEmployee> {

    @Override
    public int compare(SalarieEmployee o1, SalarieEmployee o2) {
        return (int) (o1.calculatePay() + o2.calculatePay());
    }
}
