package DecoratorDeno2;

public class IPhone implements Phone {
    @Override
    public void Call() {
        System.out.println("差一步");
    }
}
