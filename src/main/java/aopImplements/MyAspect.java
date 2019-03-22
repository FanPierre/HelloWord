package aopImplements;

public class MyAspect {
    public  void before(){
        System.out.println("通知前");
    }
    public  void after(){
        System.out.println("通知后");
    }
}
