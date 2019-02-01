package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.util.Random;
import java.util.Spliterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.forEach(System.out::println);
        Iterator<String> iterable=arr.iterator();
        System.out.println("相差---------------");
        while (iterable.hasNext()){
            String element=iterable.next();
            System.out.println(element);
        }

        Spliterator<String> spliterator = arr.spliterator();
        while (spliterator.tryAdvance(n ->arr.add(1,"a")));


    }
}
