package reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 反射技术：其实就是动态加载一个指定的类，并获取该类中的所有的内容。并将字节码文件中的内容都封装成对象，这样便于操作这些成员。简单说：反射技术可以对一个类进行解剖。



 反射的好处：大大的增强了程序的扩展性。



 反射的基本步骤：

 1、获得Class对象，就是获取到指定的名称的字节码文件对象。

 2、实例化对象，获得类的属性、方法或构造函数。

 3、访问属性、调用方法、调用构造函数创建对象。


 */

public class MethodDemo {

    private long times = 100_100_100L;
    private Student student;
    private String formatter = "%s %d times using %d ms";

    public  void setUp(){
        student=new Student();
        student.setName("222");
    }



    public void directGet() {
       /* StopWatch stopWatch=StopWatch.createStarted();
        for (long i=0;i<times;i++){
            student.getName();
        }
        stopWatch.stop();
        long splitNanoTime = stopWatch.getSplitNanoTime();
        String directGet = String.format(formatter, "directGet", times, splitNanoTime);
        System.out.println(directGet);*/

    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();

        HashMap hashMap = new HashMap();

        try {
            //获取字节码
            Class<?> stuClass = Class.forName("reflection.Student");
            Class clazz2 = Student.class;
            //创建对象
            Object obj = new Student();

            Class<?> aClass1 = obj.getClass();
            Object o = aClass1.newInstance();

            Method[] methods = stuClass.getMethods();

/*            for (Method method:methods
                 ) {
                System.out.println(method);

            }*/

            //方法:2 运行私有方法
            Method[] declaredMethods = stuClass.getDeclaredMethods();
            Method method1 = stuClass.getDeclaredMethod("setAge", Integer.class);
            method1.setAccessible(true);
            System.out.println(method1);

            //方法3 执行方法
            Method setName = stuClass.getMethod("setName", String.class);
            method1.invoke(o);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        MethodDemo methodDemo=new MethodDemo();
        methodDemo.directGet();




       /* //方法二 通过java Class自带的反射获得method ，仅进行一次method 方法的获取

        Method getName = reflection.Student.class.getMethod("getName");
        StopWatch stopWatch = StopWatch.createStarted();
       *//* reflection.Student student1=new reflection.Student();
        Object invoke = getName.invoke(student1);
*//*

        //方法一

        Class<? extends reflection.Student> aClass = student.getClass();
        Field[] fields = FieldUtil.getFields(aClass);
        try {
            for (Field field : fields
                    ) {
                field.setAccessible(true);
                field.set("name", "123");

                System.out.println(student.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

   /* private void classDemo(Object A,Object B) throws InvocationTargetException, IllegalAccessException {
        Method[] methodsA = A.getClass().getMethods();
        Method[] methodsB = B.getClass().getMethods();
        for (Method method:methodsA
             ) {
            method.invoke(A,B);
        }
    }*/


}
