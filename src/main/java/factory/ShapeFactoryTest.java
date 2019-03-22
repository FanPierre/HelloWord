package factory;

/**
 * 工厂模式
 *
 *
 */
public class ShapeFactoryTest {


    // 简单工厂模式
    //方式1 通过if
    public static Shape getInstance(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
    //方式2通过反射
    public static Object getInstance2(Class<? extends Shape> clazz) {
        Object o=null;
        try {
             o = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return o;
    }

    //方式三 可通过配置文件+反射(略.....)


    //工厂模式
    public static void main(String[] args) {
        FactoryTest squarFactory = new SquarFactory();
        Shape shape = squarFactory.getShape();
        shape.draw();

    }
}
