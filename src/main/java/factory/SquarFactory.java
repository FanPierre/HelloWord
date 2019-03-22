package factory;

public class SquarFactory implements FactoryTest {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
