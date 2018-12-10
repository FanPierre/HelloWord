package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Car {
    public static Car create(final Supplier<Car> supplier){
        System.out.println("cat 构造方法");
        return supplier.get();
    }

    public static  void colliet(final Car car){
        System.out.println("Collided " + car.toString());
    }

    public void follow (final Car anther){
        System.out.println("Following the "+anther.toString());
    }
    public void  repair(){
        System.out.println("Repai");
    }

    public static void main(String[] args) {
        final Car car =Car.create(Car::new);
        final List<Car> cars= Arrays.asList(car);
        cars.forEach(Car::repair);


    }
}
