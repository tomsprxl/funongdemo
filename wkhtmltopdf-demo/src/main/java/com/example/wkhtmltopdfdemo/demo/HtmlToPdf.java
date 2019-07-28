package com.example.wkhtmltopdfdemo.demo;

import java.io.File;

/**
 * html 转 pdf 工具类
 * @author xulia
 * @create 2019-07-27 13:29
 */
public class HtmlToPdf {
    //wkhtmltopdf在系统中的路径
    private static final String TOPDFTOOL = "F:/wkhtmltopdf/wkhtmltopdf/bin/wkhtmltopdf.exe";
    /**
     * html转pdf
     * @param srcPath html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @return 转换成功返回true
     */
    public static boolean convert(String srcPath, String destPath){
        File file = new File(destPath);
        File parent = file.getParentFile();
        //如果pdf保存路径不存在，则创建路径
        if(!parent.exists()){
            parent.mkdirs();
        }

        StringBuilder cmd = new StringBuilder();
        cmd.append(TOPDFTOOL);
        cmd.append(" ");
        //页眉下面的线
        cmd.append("  --header-line");
        //页眉中间内容
        cmd.append("  --header-center 这里是页眉这里是页眉这里是页眉这里是页眉 ");
        //设置页面上边距 (default 10mm)
        //cmd.append("  --margin-top 30mm ");
        //    设置页眉和内容的距离,默认0
        cmd.append(" --header-spacing 10 ");
        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath);

        boolean result = true;
        try{
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdfInterceptor error = new HtmlToPdfInterceptor(proc.getErrorStream());
            HtmlToPdfInterceptor output = new HtmlToPdfInterceptor(proc.getInputStream());
            error.start();
            output.start();
            proc.waitFor();
        }catch(Exception e){
            result = false;
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        HtmlToPdf.convert("https://yq.aliyun.com/articles/91154", "G:/temp/2.pdf");
    }
}
