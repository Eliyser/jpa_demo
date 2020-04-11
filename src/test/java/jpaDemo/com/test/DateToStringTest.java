package jpaDemo.com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringTest {
    public static void main(String[] args) throws ParseException {
        String date="";
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("2018.07.3");
        System.out.println(date1.toString());
    }

}
