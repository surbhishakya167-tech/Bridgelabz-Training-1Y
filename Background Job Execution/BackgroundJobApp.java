public class BackgroundJobApp {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Task started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("Task completed");
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread running...");
    }
}