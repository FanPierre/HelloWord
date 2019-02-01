package Thread.lock;

public class Thread1 extends Thread {
    private DeadLock deadLock1;

    public Thread1(DeadLock deadLock1){
        this.deadLock1=deadLock1;
    }


    @Override
    public void run() {
        try {
            deadLock1.rightLeft();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
