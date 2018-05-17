public class MyRunnable implements Runnable {
    private volatile boolean active;
    public void run() {
        active = true;
        while (active) {
            System.out.println("Hello, World!");
        }
    }
    public void stop() {
        active = false;
    }
}
