package Lambda;

import java.awt.*;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("hello lambda!"));
        thread.start();

        List list = Arrays.asList(new String[]{"a", "b", "c"});
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//        Collections.sort(list,(str1,str2) ->str1.compareTo(str2));
        List<String> proNames = Arrays.asList(new String[]{"NI", "HAO", "LAMBDA"});
        List<String> lowercaseName = new ArrayList<>();
        for (String str : proNames
        ) {
            lowercaseName.add(str.toLowerCase());
        }
        List<String> lowercaseName1=proNames.stream().map(name ->{return  name.toLowerCase();} ).collect(Collectors.toList());
    }

}
