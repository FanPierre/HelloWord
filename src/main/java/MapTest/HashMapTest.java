package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        hashMap.put("zhangsan", 222d);
        hashMap.put("lisi", 111.1);
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();
        Set<String> mapSet = hashMap.keySet();
        Iterator<String> iterator = mapSet.iterator();
        while (iterator.hasNext()){

        }

        for (Map.Entry<String, Double> me : set
        ) {
            if (me.getKey() == "zhangsan") {
                System.out.println(me.getKey());
                System.out.println(me.getValue());
            }
        }
    }
}
