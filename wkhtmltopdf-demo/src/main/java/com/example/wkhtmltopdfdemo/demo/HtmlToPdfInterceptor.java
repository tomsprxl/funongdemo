package com.example.wkhtmltopdfdemo.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author xulia
 * @create 2019-07-27 9:56
 */
public class HtmlToPdfInterceptor extends Thread {
    private InputStream is;

    public HtmlToPdfInterceptor (InputStream is){
        this.is=is;
    }

    @Override
    public void run() {
        try{
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                //输出内容
                System.out.println(line.toString());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }




}