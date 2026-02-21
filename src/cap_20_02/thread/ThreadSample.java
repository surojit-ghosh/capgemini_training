package cap_20_02.thread;

class MultithreadSample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

class ThreadSample2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("ThreadSample2 is running: " + Thread.currentThread().getName() + " - " + i);
            } catch (InterruptedException e) {
                System.out.println("ThreadSample2 was interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadSample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultithreadSample());
        Thread thread2 = new Thread(new MultithreadSample());

        ThreadSample2 thread3 = new ThreadSample2();
        ThreadSample2 thread4 = new ThreadSample2();

        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread5.start();


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
