package org.example.counter;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread th1 = new Thread(counter, "Thread-1");
        Thread th2 = new Thread(counter, "Thread-2");
        Thread th3 = new Thread(counter, "Thread-3");

        th1.start();
        th2.start();
        th3.start();
    }
}
