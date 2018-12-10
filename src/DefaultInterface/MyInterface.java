package DefaultInterface;

public interface MyInterface {
    int print();
    int printA();
    default void printB(){
        System.out.println(111);
    }
}
