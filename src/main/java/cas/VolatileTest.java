package  cas;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/*
* 使用AtomicInteger 可以保證原子性，使数据不会因为多线程而误读数据
* */
public class VolatileTest {
    public static AtomicInteger  race=new AtomicInteger(0);
    private static  void increase(){
        race.getAndIncrement();

    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("","");


        Thread[] threads = new Thread[20];
        for (int i=0;i<20;i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<2000;j++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);

    }

}
