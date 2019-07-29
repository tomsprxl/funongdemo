package com.example.scheduledemo.schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-07-29 11:11
 */
public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable,3,5, TimeUnit.SECONDS);

    }



}