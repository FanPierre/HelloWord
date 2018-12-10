package simpleDemo;

public class singletonDemo {

    private final static singletonDemo singleton = new singletonDemo();

    private singletonDemo() {

    }

    public static singletonDemo getSimpleDemo() {
        return singleton;

    }

}
