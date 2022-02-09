package HomeWorkTask1Lesson7;

import java.util.Comparator;

public class CalculetCamparator implements Comparator <ContractEmployee>{


    @Override
    public int compare(ContractEmployee o1, ContractEmployee o2) {
        return (int) (o1.calculatePay() + o2.calculatePay());
    }
}
