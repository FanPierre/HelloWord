package reflection;

import java.util.Objects;

public class A {
    private String Test1;
    private String Test2;

    public String getTest1() {
        return Test1;
    }

    public A(String test1, String test2) {
        Test1 = test1;
        Test2 = test2;
    }

    public String getTest2() {
        return Test2;
    }

    public void setTest1(String test1) {
        Test1 = test1;
    }

    public void setTest2(String test2) {
        Test2 = test2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(Test1, a.Test1) &&
                Objects.equals(Test2, a.Test2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Test1, Test2);
    }

    @Override
    public String toString() {
        return "A{" +
                "Test1='" + Test1 + '\'' +
                ", Test2='" + Test2 + '\'' +
                '}';
    }


}
