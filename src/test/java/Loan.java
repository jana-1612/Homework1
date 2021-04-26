import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loan {

    @Test
    public void Expenses() {
        double amount = 10000;
        double expenses = amount * 0.1 + amount * 0.08 + amount * 0.06;
        double total = amount + expenses;
        System.out.println(total);

        Assertions.assertEquals(12400, total, "Sum is not correct");
    }
}