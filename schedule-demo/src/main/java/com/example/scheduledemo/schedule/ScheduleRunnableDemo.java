package com.example.scheduledemo.schedule;

/**
 * 描述:
 * 普通thread
 * * 这是最常见的，创建一个thread，然后让它在while循环里一直运行着，
 * * 通过sleep方法来达到定时任务的效果
 *
 * @author xuliang
 * @create 2019-07-29 11:01
 */
public class ScheduleRunnableDemo {
    private static final long TIMERINTERVAL = 5000;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
             while (true){
                 System.out.println("-------设定要指定任务--------");
                 try {
                     Thread.sleep(TIMERINTERVAL);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }


}