package thread;

public class Main {
    public static void main(String[] args) {

        //CREATE THREAD
//        for (int i = 0; i < 15; i++) {
//            Thread thread = new Thread(new MyThread(i));
//
//             thread.start();
//        }

        //DEADLOCK
//        System.out.println("I am entering to deadlock");
//
//        try {
//            Thread.currentThread().join();
//
//            System.out.println("This text will never print");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //THREAD POOL
//        ExecutorService ex = Executors.newFixedThreadPool(4);
//
//        ex.shutdown();
//        try {
//            ex.awaitTermination(1, TimeUnit.DAYS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        ExecutorService ex = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i < 5; i++) {
//            ex.submit(new MyThread(i));
//        }
//
//        ex.shutdown();
//
//        System.out.println("All threads terminated");


    }
}
