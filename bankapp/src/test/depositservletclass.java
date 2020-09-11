import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class depositservletclass {


    @Test
    public void test() {
        DepositServlet dd = new DepositServlet();

        double bal;
        bal = dd.deposit(5000, 35000);
        assertEquals(40000, bal);

    }

}
