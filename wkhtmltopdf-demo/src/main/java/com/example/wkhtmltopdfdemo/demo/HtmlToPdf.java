package com.example.wkhtmltopdfdemo.demo;

import com.example.wkhtmltopdfdemo.util.FilePathUtil;

import java.io.File;

/**
 * html 转 pdf 工具类
 *
 * @author xulia
 * @create 2019-07-27 13:29
 */
public class HtmlToPdf {
    //项目根路径/files/contract_pdf/2019-09-02/2019-09-02-17-53-41-5d6ce6a5e4113.pdf
    //wkhtmltopdf在系统中的路径
    private static final String TOPDFTOOL = "G:/util/wkhtmltopdf/bin/wkhtmltopdf.exe";

    /**
     * html转pdf
     *
     * @param srcPath  html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @return 转换成功返回true
     */
    public static String convert(String srcPath, String destPath) {
        File file = new File(destPath);
        File parent = file.getParentFile();
        //如果pdf保存路径不存在，则创建路径
        if (!parent.exists()) {
            parent.mkdirs();
        }

        StringBuilder cmd = new StringBuilder();
        cmd.append(TOPDFTOOL);
        cmd.append(" ");
        cmd.append("  --encoding utf-8");
        //页眉下面的线
//        cmd.append("  --header-line");
        //页眉中间内容
//        cmd.append("  --header-center ");
        //设置页面上边距 (default 10mm)
        cmd.append("  --margin-top 30mm ");
        //设置页眉和内容的距离,默认0
        cmd.append(" --header-spacing 10 ");
        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath);

        boolean result = true;
        try {
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdfInterceptor error = new HtmlToPdfInterceptor(proc.getErrorStream());
            HtmlToPdfInterceptor output = new HtmlToPdfInterceptor(proc.getInputStream());
            error.start();
            output.start();
            proc.waitFor();
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }

        return destPath;
    }


    public static void main(String[] args) {
        HtmlToPdf.convert("src\\files\\contract_pdf\\2019-9-3\\2019-9-3-13-51-31-e6475b8976805.html",
                FilePathUtil.getPdfPath());
    }
}
