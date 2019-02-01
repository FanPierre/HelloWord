package introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntrospectorTest {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Student.class, Object.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors
                    ) {
                String name = propertyDescriptor.getName();
                Method readMethod = propertyDescriptor.getReadMethod();
                Object aa = readMethod.invoke("aa");
                System.out.println(aa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
