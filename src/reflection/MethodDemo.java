package reflection;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodDemo {
    public static void main(String[] args) {



    }

    private void classDemo(Object A,Object B){
        Method[] methodsA = A.getClass().getMethods();
        Method[] methodsB = B.getClass().getMethods();
        for (Method method:methodsA
             ) {
            method.invoke(A,B);
            
        }
    }


}
