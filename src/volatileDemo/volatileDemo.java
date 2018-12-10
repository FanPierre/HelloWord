package volatileDemo;

public class volatileDemo {
    public static  volatile int inc=0;

    public synchronized void increase(){
        inc++;
    }

    public static void main(String[] args) {
        final volatileDemo test=new volatileDemo();
        for (int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    for (int j=0;j<1000;j++){
                        test.increase();
                    }
                };
            }.start();
        }

        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(test.inc);

    }
}
