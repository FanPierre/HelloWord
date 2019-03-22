package Test;


import java.math.BigDecimal;

public class test {
    public test() {
    }

    public static void main(String[] args) {

        final BigDecimal bigDecimal = new BigDecimal("5");
        bigDecimal.compareTo(new BigDecimal(5.00));

    }
}
