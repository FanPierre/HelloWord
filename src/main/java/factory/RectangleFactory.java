package factory;

public class RectangleFactory implements FactoryTest {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
