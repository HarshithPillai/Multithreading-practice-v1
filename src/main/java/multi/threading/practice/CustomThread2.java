package multi.threading.practice;

class CustomThread2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread() + " is running: " + i);
        }
    }
}