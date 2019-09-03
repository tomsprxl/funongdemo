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

        String newFath = ROOTPATH + File.separator + year + "-" + month + "-" + day;

        return null;

    }

    public static void main(String[] args) {
        System.out.println(getFilePath());
    }


}