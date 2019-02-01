package Thread.lock;

public class Thread0 extends Thread{
    private  DeadLock deadLock1;

    public Thread0(DeadLock deadLock1){
        this.deadLock1=deadLock1;
    }
    @Override
    public void run() {
        try {
            deadLock1.leftRight();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
