public class MultiThread extends Thread {
    public void run() {
        // System.out.println("Thread is running...");
        // }
        for (int i = 1; i <= 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread Priority" + Thread.currentThread().getPriority());
            System.out.println(i);
        }

    }

    public static void main(String args[]) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        t1.start();
        t2.start();

        // t1.setName("T1");
        // String name = t1.getName();
        // System.out.println(name);
        // thread class

        // MultiThread m1 = new MultiThread();
        // Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
        // t1.start();
        // runnable
    }

}
