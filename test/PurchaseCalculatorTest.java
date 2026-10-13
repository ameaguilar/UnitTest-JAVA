import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PurchaseCalculatorTest {

    PurchaseCalculator purchaseCalculator = new PurchaseCalculator();

    @Test
    @DisplayName("Prueba método subtotal()")

    void subtotalProof () {

        //valor esperado, llamar funcion
        assertEquals(300, purchaseCalculator.subtotal(100,3));
        assertEquals(248.37, purchaseCalculator.subtotal(248.37,1));
        assertEquals(0.0, purchaseCalculator.subtotal(99.9,0));

    }

    @Test
    @DisplayName("Prueba método validación()")

    void isValidProof () {

        assertTrue(purchaseCalculator.isValidPurchase(120,3));
        assertFalse(purchaseCalculator.isValidPurchase(0,11));
        assertFalse(purchaseCalculator.isValidPurchase(34.53,0));
        assertFalse(purchaseCalculator.isValidPurchase(-134,12));

    }

    @Test
    @DisplayName("Prueba método descuento()")

    void discountProof () {

        assertEquals(140, purchaseCalculator.calculateDiscount(140));
    }



} // class PurchaseCalculatorTest
