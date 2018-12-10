package simpleDemo;

//双重检查
public class singletonDemo2 {
    private static volatile singletonDemo2 singleton;

    private singletonDemo2(){};

    public static singletonDemo2 getInstance(){
        if (singleton==null){
            synchronized(singletonDemo2.class){
                if (singleton == null){
                    return new singletonDemo2();
                }
            }
        }
        return  singleton;
    }
}
