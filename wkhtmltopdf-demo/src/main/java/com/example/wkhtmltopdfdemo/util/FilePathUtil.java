package com.example.wkhtmltopdfdemo.util;

import java.io.File;
import java.util.Calendar;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-03 9:19
 */
public class FilePathUtil {
    //项目根路径/files/contract_pdf/2019-09-02/2019-09-02-17-53-41-5d6ce6a5e4113.pdf

    private static final String ROOTPATH = "src" + File.separator + "files" + File.separator + "contract_pdf";

    public static String getFilePath() {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0代表1月，11代表12月
        int day = cal.get(Calendar.DAY_OF_MONTH);


        return ROOTPATH + File.separator + year + "-" + month + "-" + day;

    }

    public static String getPdfPath() {
        return getFilePath() + File.separator+GenerateRandomCodeUtil.generatePDFOrImageCode()+".pdf";
    }

    public static String getHtmlPath() {
        return getFilePath() + File.separator+GenerateRandomCodeUtil.generatePDFOrImageCode()+".html";
    }

    public static String getPngPath() {
        return getFilePath() + File.separator+GenerateRandomCodeUtil.generatePDFOrImageCode()+".png";
    }

    public static void main(String[] args) {

    }


}