package test;

public class test1 {
    String a="1";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        test1 test1 = (test1) o;

        return a != null ? a.equals(test1.a) : test1.a == null;
    }

    @Override
    public int hashCode() {
        return a != null ? a.hashCode() : 0;
    }

    public static void main(String[] args) {
        Integer a=1,b=2;
        System.out.println("a :" + a + "b :" + b);
        swap(a,b);
        System.out.println("a :" + a + "b :" + b);

    }

    private static void swap(Integer a, Integer b) {
        int i=0;

    }


}
