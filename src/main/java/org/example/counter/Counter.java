package org.example.counter;

public class Counter implements Runnable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }

    @Override
    public void run() {
        // 동기화
        synchronized (this) {
            this.increment();
            System.out.println("Value for Thread After Increment " + Thread.currentThread().getName() + " " + getValue());

            this.decrement();
            System.out.println("Value for Thread After Decrement " + Thread.currentThread().getName() + " " + getValue());
        }
    }
}
