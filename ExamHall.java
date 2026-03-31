class EntryMonitor extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Student Entry Monitoring... " + i + " | State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class QuestionPaper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Distributing Question Papers... " + i + " | State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Marking Attendance... " + i + " | State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Collecting Answer Sheets... " + i + " | State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {

        EntryMonitor entry = new EntryMonitor();
        QuestionPaper qp = new QuestionPaper();
        Attendance att = new Attendance();
        Collection col = new Collection();

        qp.setPriority(10);
        att.setPriority(8);
        entry.setPriority(5);
        col.setPriority(7);

        System.out.println("Initial State:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        entry.start();
        qp.start();
        att.start();
        col.start();

        System.out.println("After Start:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        try {
            entry.join();
            qp.join();
            att.join();
            col.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final State:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());
    }
}