package multi.threading.practice;

class MultiThreadingPractice {
    public static void main(String[] args) {
        System.out.println("Main started...");
        Thread t1 = new CustomThread1("custom1");
//        t1.setDaemon(true);
        t1.start();
        Thread t2 = new Thread(new CustomThread2(), "runnable_thread");
        t2.start();
        Thread t3 = new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println(Thread.currentThread()+ " is running " + i);
            }
        }, "runnable_thread_20000");
        t3.start();
        System.out.println("Main exiting...");
//
    }
}