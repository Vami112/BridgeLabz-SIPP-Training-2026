package interfaces.coupon;

public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE50",
                "ABC12",
                "SAVE",
                "SAVE1234567",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}
