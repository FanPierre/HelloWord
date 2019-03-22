package Optional;

import java.util.Optional;

public class Java8TestRr {
    public static void main(String[] args) {
        Java8TestRr Java8Tester=new Java8TestRr();
        Integer integer=null;
        Integer integer1 = new Integer(10);
        Optional<Integer> optional=Optional.ofNullable(integer);
        System.out.println(optional);


    }
}
