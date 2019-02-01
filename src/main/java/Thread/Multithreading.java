package Thread;

public class Multithreading {
    public static void main(String[] args) {
        Thread thread = new Thread();

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                thread.start();

            }
        };

    }




}
