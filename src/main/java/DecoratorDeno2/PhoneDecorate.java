package DecoratorDeno2;

public abstract class PhoneDecorate implements  Phone {
    private  Phone phone;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void Call() {
        this.phone.Call();

    }
}
