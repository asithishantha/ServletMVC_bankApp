import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class withdrawservletclass {

    @Test
    public void test() {
        WithdrawServlet dd = new WithdrawServlet();


        double bal;
        bal = dd.withdraw(35000, 5000);
        assertEquals(30000, bal);

    }

}


