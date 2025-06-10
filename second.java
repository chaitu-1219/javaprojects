package first;

import java.util.concurrent.Semaphore;

class Foo {
    private Semaphore sem1;
    private Semaphore sem2;

    public Foo() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
    }

    public void first() {
        System.out.print("first");
        sem1.release();
    }

    public void second() throws InterruptedException {
        sem1.acquire();
        System.out.print("second");
        sem2.release();
    }

    public void third() throws InterruptedException {
        sem2.acquire();
        System.out.print("third");
    }
}
public class second {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Thread threadA = new Thread(() -> {
            try {
                foo.first();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                foo.second();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                foo.third();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}