package DefaultInterface;

public class MyInterfaceImpl implements MyInterface,MyInterface2 {
    @Override
    public int print() {
        int i = 0;
        return i;
    }

    @Override
    public int printA() {
        return 0;
    }

    @Override
    public void printB() {
        System.out.println(22222);
    }

    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.printB();
    }
}
