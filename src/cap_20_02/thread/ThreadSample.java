package cap_20_02.thread;

class MultithreadSample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadSample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultithreadSample());
        Thread thread2 = new Thread(new MultithreadSample());

        thread1.start();
        thread2.start();
    }
}
