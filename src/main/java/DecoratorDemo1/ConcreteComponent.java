package DecoratorDemo1;

/**
 * 抽象类的具体实现
 */
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
