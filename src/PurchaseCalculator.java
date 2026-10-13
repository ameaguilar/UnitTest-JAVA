public class PurchaseCalculator {

    public double subtotal (double price, int quantity) {
        return price * quantity;
    } // metodo subtotal

    public boolean isValidPurchase (double price, int quantity) {
        if (price <= 0 || quantity <= 0  ) {
            return false;
        } else {
            return true;
        }
    } // metodo booleano

    public double calculateDiscount (double subtotal) {

        if (subtotal > 1000) {
            return subtotal * .10;
        } else {
            return subtotal;
        }
    } // metodo

} // class PurchaseCalulator
