package Gen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class GenDemo {
    public static void main(String[] args) {


        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(111)){
                    return 2;
                }
                if (o1.equals(222)){
                    return 2;
                }
                return o1.compareTo(o2);
            }
        };
        ArrayList<Integer> list=new ArrayList();
        list.add(111);
        list.add(333);
        list.add(222);
        list.sort(comparator);
        for (Integer i:list
             ) {
            System.out.println(i);
        }

    }
}
