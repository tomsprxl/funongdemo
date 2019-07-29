package com.example.scheduledemo.schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 描述:
 * java定时任务可以借助 java.util.Timer 来实现
 *
 * @author xuliang
 * @create 2019-07-29 10:39
 */
public class ScheduleTimerDemo {
    public static void main(String[] args) {
//      timer1();
        timer2();
    }

    public static void timer1() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, 1000,5000);
    }


    public static void  timer2(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,11);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);

        Date time = calendar.getTime();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        },time,5000);

    }



}