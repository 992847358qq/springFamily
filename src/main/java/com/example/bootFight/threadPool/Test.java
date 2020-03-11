package com.example.bootFight.threadPool;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间");
        System.out.println(System.currentTimeMillis());
        System.out.println("昨天");
        System.out.println(getTimeMillis());
        System.out.println("半小时：");
        System.out.println(getTimeMillis("00:00:00"));
    }
    /**
     * 获取指定时间对应的毫秒数
     * @param time "HH:mm:ss"
     * @return
     */
    public static long getTimeMillis(String time){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = null;
        try {
            curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static long getTimeMillis(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2020-02-17");
            long longDate = date.getTime();
            return longDate;
        } catch (ParseException e) {
        }
        return 0;
    }
}
