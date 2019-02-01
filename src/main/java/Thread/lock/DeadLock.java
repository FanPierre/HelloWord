package Thread.lock;

public class DeadLock {
    private final Object left=new Object();
    private final Object right=new Object();

    public void leftRight() throws InterruptedException {
        synchronized (left){
            Thread.sleep(5000);
            synchronized (right){
                System.out.println("leftRight End!");
            }
        }
    }
    public void  rightLeft() throws InterruptedException {
        synchronized (right){
            Thread.sleep(5000);
            synchronized (left){
                System.out.println("rightLeft End!");
            }
        }
    }
}
