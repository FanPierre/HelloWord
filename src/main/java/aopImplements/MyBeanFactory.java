package aopImplements;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 方式
 */
public class MyBeanFactory {

    //JDK动态代理
    public static UserService createUserServiceAop(){
        final UserService userService = new UserServiceImpl();
        final MyAspect myAspect = new MyAspect();
        //创建代理实例
        UserService proxyService = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               //调用之前
                myAspect.before();

                Object obj = method.invoke(userService, args);
                //调用之后
                myAspect.after();
                return obj;
            };
        });
        return proxyService;
    }

    //使用cglib字节码增强
    public static UserService createUserServices(){
        final UserService userService=new UserServiceImpl();
        final MyAspect myAspect = new MyAspect();
        Enhancer enhancer = new Enhancer();
        //指定父类
        enhancer.setSuperclass(userService.getClass());
        //指定调用
        enhancer.setCallback(new MethodInterceptor() {

            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
               // 两种方式
      //     1.     final Object invoke = method.invoke(userService, objects);
                //2.
                final Object o1 = methodProxy.invokeSuper(o, objects);
                myAspect.after();
                return o1;
            }
        });
        UserServiceImpl userService1=(UserServiceImpl)enhancer.create();
        return userService1;
    }


   public static UserService doCglib(){
       Enhancer enhancer = new Enhancer();
       MyAspect myAspect = new MyAspect();

       UserServiceImpl userService = new UserServiceImpl();
       enhancer.setSuperclass(userService.getClass());
       enhancer.setCallback(new MethodInterceptor() {
           @Override
           public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
               //代理方法
               myAspect.before();
               //调用方法
               Object invoke = methodProxy.invoke(o,objects);

               myAspect.after();
               return invoke;
           }
       });
       UserServiceImpl userService1=(UserServiceImpl)enhancer.create();
       return userService1;
   }
}
