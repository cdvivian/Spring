package com.cd.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cdviviany
 * @version 1.00
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        //将日期转换成真正的日期对象返回
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
             date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
