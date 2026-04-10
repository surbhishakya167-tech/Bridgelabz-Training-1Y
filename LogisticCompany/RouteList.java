package LogisticCompany;
class RouteList {
    class Node {
        Checkpoint data;
        Node next;

        Node(Checkpoint d) {
            data = d;
        }
    }

    Node head;

    public void add(Checkpoint c) {
        Node n = new Node(c);

        if (head == null) {
            head = n;
            return;
        }

        Node t = head;
        while (t.next != null)
            t = t.next;

        t.next = n;
    }

    public double totalDistance() {
        double sum = 0;
        Node t = head;

        while (t != null) {
            sum += t.data.getDistance();
            t = t.next;
        }
        return sum;
    }

    public double totalPenalty() {
        double sum = 0;
        Node t = head;

        while (t != null) {
            sum += t.data.getPenalty();  // Polymorphism here
            t = t.next;
        }
        return sum;
    }

    public void print() {
        Node t = head;

        while (t != null) {
            System.out.println(t.data.getType() + " - " +
                    t.data.getName() +
                    " - Penalty: " + t.data.getPenalty());
            t = t.next;
        }
    }
}