//Synchronization Modifiers
package java.assignment1and2.src.Assignment;

public class SynchronizedExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

