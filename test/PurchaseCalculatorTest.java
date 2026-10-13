import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PurchaseCalculatorTest {

    PurchaseCalculator purchaseCalculator = new PurchaseCalculator();

    @Test
    @DisplayName("Prueba método subtotal()")

    void pruebaSubtotal () {

        //valor esperado, llamar funcion
        assertEquals(300, purchaseCalculator.subtotal(100,3));
        assertEquals(248.37, purchaseCalculator.subtotal(248.37,1));
        assertEquals(0.0, purchaseCalculator.subtotal(99.9,0));

    }


} // class PurchaseCalculatorTest
