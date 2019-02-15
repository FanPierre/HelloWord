package date;

import java.time.LocalDateTime;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        Date date = new Date();
        date.testLocalDateTime();

    }
    public void testLocalDateTime(){
        //获取当前的时间
        LocalDateTime currentTime=LocalDateTime.now();
        System.out.println("当前时间："+currentTime);
        Month month = currentTime.getMonth();


    }
}
