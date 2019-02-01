package Thread;

import java.io.IOException;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        System.out.println("请在50秒之内按任意键中断线程");
        int read = System.in.read();
        threadDemo.interrupt();
        threadDemo.join();
        System.out.println("线程已经退出"+"时间"+read);


    }
}
