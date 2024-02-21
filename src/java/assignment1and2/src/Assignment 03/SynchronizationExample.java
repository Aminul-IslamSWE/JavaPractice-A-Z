package java.assignment1and2.src.Assignment;

public class SynchronizationExample {
    private int counter = 0;

    // Synchronized method
    public synchronized void increment() {
        counter++;
    }

    // Non-synchronized method
    public void nonSynchronizedMethod() {

    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();

        // Multiple threads incrementing the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                example.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final counter value
        System.out.println("Final Counter Value: " + example.getCounter());
    }

}
