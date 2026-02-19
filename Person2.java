class Person2 {
    String name;
    int id;
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {

    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {

    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {

        Chef c = new Chef();
        c.name = "Ravi";
        c.id = 1;
        c.performDuties();

        Waiter w = new Waiter();
        w.name = "Aman";
        w.id = 2;
        w.performDuties();
    }
}
