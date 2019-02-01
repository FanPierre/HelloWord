package DecoratorDeno2;

public class GiveCurrentTimePhone extends  PhoneDecorate {
    public GiveCurrentTimePhone(Phone phone) {
        super(phone);
    }

    public  void  getTime(){
        System.out.println("时间:"+System.currentTimeMillis());
    }

    @Override
    public void Call() {
        super.Call();
        getTime();
    }


}
