package Test;


import java.util.ArrayList;
import java.util.TreeSet;

public class test {
 /*   public void Test(){
        T vals[];
    }*/

    public static void main(String[] args) {
/*        Runtime runtime = Runtime.getRuntime();
        long mem1,mem2;
        Integer someints[]=new Integer[1000];
        mem1 = runtime.freeMemory();
        System.out.println("Total memory is:"+ runtime.totalMemory());
        mem1= runtime.freeMemory();
        System.out.println("Initial free memory:"+ mem1);
        runtime.gc();
        mem1=runtime.freeMemory();
        System.out.println("Free memory "+mem1);

        for (int i=0;i<1000;i++)
            someints=new Integer[i];

        mem2=runtime.freeMemory();
        System.out.println("Free memory after allocation:" + mem2);
        System.out.println(mem2-mem1);



        Class<?> cla = test.class.getClass();*/

        /*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filed=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        List<Integer> number2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> integers = number2.stream().map(i -> i * i).distinct().collect(Collectors.toList());

        number2.forEach(System.out::println);
        System.out.println("111"+stats.getMax()+"最大数");*/
        String a="1";
        String b="2";
        System.out.println(a.equals(b));
        TreeSet<String> treeSet=new TreeSet();
        treeSet.add("");

    }
}
