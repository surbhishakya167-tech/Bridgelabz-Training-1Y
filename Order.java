class Order {
    int orderId;
    String orderDate;

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderTest {
    public static void main(String[] args) {

        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 101;
        d.orderDate = "19-02-2026";
        d.trackingNumber = "TRK12345";
        d.deliveryDate = "21-02-2026";

        System.out.println("Order ID: " + d.orderId);
        System.out.println("Order Date: " + d.orderDate);
        System.out.println("Tracking Number: " + d.trackingNumber);
        System.out.println("Delivery Date: " + d.deliveryDate);
        System.out.println("Status: " + d.getOrderStatus());
    }
}
