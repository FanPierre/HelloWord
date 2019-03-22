package aopImplements;

public class demoTest {
    public static void main(String[] args) {
       // JDK 动态代理
       // UserService userServiceAop = MyBeanFactory.createUserServiceAop();
       // cglib 字节码增强方式
        final UserService userServices = MyBeanFactory.createUserServices();
        userServices.User();
        userServices.addUser();
        userServices.updateUser();

    }

}
