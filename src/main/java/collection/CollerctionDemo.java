package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollerctionDemo {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("1234");
        str.add("123");
        str.add("222");
        str.add("223");
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("222");
        str2.add("224");
        //用二分法查找值
        int i = Collections.binarySearch(str, "123");
        int frequency = Collections.frequency(str, "222");
        Comparator<Iterable> objectComparator = Collections.reverseOrder();
        System.out.println(frequency);
    }
}
