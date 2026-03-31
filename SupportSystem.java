import java.util.Random;

class Ticket extends Thread {
    int ticketId;
    String type;
    int priority;
    static long totalTime = 0;
    static int count = 0;
    static long p10 = 0, p4 = 0, p2 = 0, p1 = 0;
    static int c10 = 0, c4 = 0, c2 = 0, c1 = 0;

    Ticket(int id, String t, int p) {
        ticketId = id;
        type = t;
        priority = p;
        setPriority(p);
    }

    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;

        System.out.println("Start -> Ticket: " + ticketId + " | Type: " + type +
                " | Agent: " + getName() + " | Priority: " + getPriority());

        long start = System.currentTimeMillis();

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long end = System.currentTimeMillis();
        long duration = (end - start) / 1000;

        System.out.println("Done -> Ticket: " + ticketId + " | Time: " + duration + " sec");

        totalTime += duration;
        count++;

        if (priority == 10) {
            p10 += duration;
            c10++;
        } else if (priority == 4) {
            p4 += duration;
            c4++;
        } else if (priority == 2) {
            p2 += duration;
            c2++;
        } else if (priority == 1) {
            p1 += duration;
            c1++;
        }
    }
}

public class SupportSystem {
    public static void main(String[] args) {

        Ticket[] t = new Ticket[10];

        t[0] = new Ticket(1, "Critical Bug", 10);
        t[1] = new Ticket(2, "Feature Request", 4);
        t[2] = new Ticket(3, "General Query", 2);
        t[3] = new Ticket(4, "Feedback", 1);
        t[4] = new Ticket(5, "Critical Bug", 10);
        t[5] = new Ticket(6, "Feature Request", 4);
        t[6] = new Ticket(7, "General Query", 2);
        t[7] = new Ticket(8, "Feedback", 1);
        t[8] = new Ticket(9, "Critical Bug", 10);
        t[9] = new Ticket(10, "General Query", 2);

        for (int i = 0; i < 10; i++) {
            System.out.println("Queue -> Ticket " + t[i].ticketId + " | Priority: " + t[i].priority);
        }

        for (int i = 0; i < 10; i++) {
            t[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Total Processing Time: " + Ticket.totalTime + " sec");

        if (Ticket.c10 > 0)
            System.out.println("Avg Critical Bug Time: " + (Ticket.p10 / Ticket.c10));
        if (Ticket.c4 > 0)
            System.out.println("Avg Feature Request Time: " + (Ticket.p4 / Ticket.c4));
        if (Ticket.c2 > 0)
            System.out.println("Avg General Query Time: " + (Ticket.p2 / Ticket.c2));
        if (Ticket.c1 > 0)
            System.out.println("Avg Feedback Time: " + (Ticket.p1 / Ticket.c1));
    }
}