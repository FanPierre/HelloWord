package simpleDemo;

//静态内部类
public class singletonDemo1 {

    private singletonDemo1(){};

    private static class singletonInstance{
         private static final singletonDemo1 singletonInstarnce=new singletonDemo1();
    }

    public static singletonDemo1 getInstance(){
        return singletonInstance.singletonInstarnce;
    }
}
