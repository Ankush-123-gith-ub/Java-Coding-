public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background task completed!");
        };

        Thread backgroundThread = new Thread(task);
        backgroundThread.start();

        System.out.println("Main program continues...");
    }
}
