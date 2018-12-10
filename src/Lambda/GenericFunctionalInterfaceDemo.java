package Lambda;
import java.util.function.*;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        String str="Hello Word!";
        char[] chars=new char[5];
        str.getChars(0,5,chars,0);
        System.out.println(chars);
        Thread thread=new Thread(() -> System.out.println());
    }
}
