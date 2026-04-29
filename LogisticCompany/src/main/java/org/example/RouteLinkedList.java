package org.example;
class RouteLinkedList<T extends Checkpoint> {

    Node<T> head;

    void addCheckpoint(T c) {
        Node<T> n = new Node<>(c);

        if (head == null) {
            head = n;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = n;
    }

    double computeTotalDistance() {
        double sum = 0;
        Node<T> temp = head;

        while (temp != null) {
            sum += temp.data.distance;
            temp = temp.next;
        }
        return sum;
    }

    double computeTotalPenalty() {
        double sum = 0;
        Node<T> temp = head;

        while (temp != null) {
            sum += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return sum;
    }

    void printRoute() {
        Node<T> temp = head;
        int i = 1;

        while (temp != null) {
            System.out.println(i + ". " + temp.data.getType() +
                    " - " + temp.data.location +
                    " - Penalty: " + temp.data.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }
}