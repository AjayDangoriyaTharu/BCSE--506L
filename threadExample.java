public class threadExample {
    public static void main(String[] args) {
        Thread t1 = new Worker();
        Thread t2 = new Worker();
        Thread t3 = new Worker();
        t1.start();
        t2.start();
        t3.start();
    }

}

class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
