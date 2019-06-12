package DecoratorDemo1;

//装饰者例子

/**
 * 使用场景 ： 1.在不影响其他对象的情况下，动态，透明的给一个对象增添额外职责
 * 2.需要动态的给一个对象增加功能，这个功能也可以被动态的撤销。当不能采用继承的方式，或采用继承时不利于系统的扩展和维护
 *
 *
 * 装饰器
 * 一个抽象类（定义它需要做的方法），一个实现类。  一个装饰器接口(调用抽象类的实现) ，N个装饰器接口实现类，进行装饰
 *
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //修饰后运行
        component.operate();
    }
}
