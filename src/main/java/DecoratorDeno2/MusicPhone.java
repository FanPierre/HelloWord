package DecoratorDeno2;

public class MusicPhone extends  PhoneDecorate {
    public MusicPhone(Phone phone) {
        super(phone);
    }

    public  void muiz(){
        System.out.println("就圆满");
    }

    @Override
    public void Call() {
        muiz();
        super.Call();
    }
}
