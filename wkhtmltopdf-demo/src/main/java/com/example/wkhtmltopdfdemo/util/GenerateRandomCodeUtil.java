package com.example.wkhtmltopdfdemo.util;

import java.util.Calendar;
import java.util.Random;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-02 18:13
 */
public class GenerateRandomCodeUtil {

    public static String randomHexString(int len) {
        try {
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < len; i++) {
                result.append(Integer.toHexString(new Random().nextInt(16)));
            }
            return result.toString().toUpperCase();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String generatePDFOrImageCode() {
        String randomHexString = randomHexString(13);
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0代表1月，11代表12月
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        return year + "-" + month + "-" + day + "-" + hour + "-" + minute + "-" + second + "-" + randomHexString;

    }

    public static void main(String[] args) {
        String s = generatePDFOrImageCode();
        System.out.println("s = " + s);
    }

}