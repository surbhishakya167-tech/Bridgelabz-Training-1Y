class Order {
    int orderId;
    String restaurant;
    int deliveryTime;

    Order(int id, String res, int time) {
        orderId = id;
        restaurant = res;
        deliveryTime = time;
    }
}

class DeliveryAgent implements Runnable {
    Order order;

    DeliveryAgent(Order o) {
        order = o;
    }

    public void run() {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();

        System.out.println("Agent: " + t.getName() + " | Order " + order.orderId + " picked up from " + order.restaurant);

        try {
            Thread.sleep(order.deliveryTime * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Agent: " + t.getName() + " | Order " + order.orderId + " in transit");

        try {
            Thread.sleep(order.deliveryTime * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long end = System.currentTimeMillis();

        System.out.println("Agent: " + t.getName() + " | Order " + order.orderId + " delivered");
        System.out.println("Order " + order.orderId + " Total Delivery Time: " + (end - start) / 1000 + " seconds");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Order o1 = new Order(1, "Pizza Hut", 2);
        Order o2 = new Order(2, "KFC", 3);
        Order o3 = new Order(3, "Dominos", 1);
        Order o4 = new Order(4, "Burger King", 4);
        Order o5 = new Order(5, "Subway", 2);

        Thread t1 = new Thread(new DeliveryAgent(o1), "Agent-1");
        Thread t2 = new Thread(new DeliveryAgent(o2), "Agent-2");
        Thread t3 = new Thread(new DeliveryAgent(o3), "Agent-3");
        Thread t4 = new Thread(new DeliveryAgent(o4), "Agent-4");
        Thread t5 = new Thread(new DeliveryAgent(o5), "Agent-5");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}