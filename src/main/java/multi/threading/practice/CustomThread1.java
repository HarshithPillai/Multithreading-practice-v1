package multi.threading.practice;

class CustomThread1 extends Thread {

    CustomThread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread() + " is running: " + i);
        }
    }
}