package com.example.wkhtmltopdfdemo.demo;

import com.example.wkhtmltopdfdemo.dao.PDFData;
import com.example.wkhtmltopdfdemo.pdftemplateenum.PdfTemplateEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 描述:
 * 接收html 模板 和数据 转换成html文件
 *
 * @author xuliang
 * @create 2019-09-02 16:35
 */
public class StrToHtml {

    public static void main(String[] args) {
        PDFData pdfData = new PDFData();
        pdfData.setContract_number("HT201908271034412880");
        pdfData.setSign_address("上海浦东");
        pdfData.setSign_time("2019-08-27");
        pdfData.setCustomers_name("舒宝");
        pdfData.setBuyer_phone("15618610895");
        pdfData.setBuyer_contract_name("舒宝");
        pdfData.setGood_tons("吨");
        pdfData.setGood_name("北京,汇福,43%,50kg");
        pdfData.setGood_num("10");
        pdfData.setGood_price("2000");
        pdfData.setContract_total_price("20000.00");
        pdfData.setContract_remark("10:34");
        pdfData.setRmb("贰万元整");
        pdfData.setEgg_attr("43%");
        pdfData.setCash_money("2000.00");
        pdfData.setDelivery_start_time("2019-08-27");
        pdfData.setDelivery_end_time("2019-08-31");
        pdfData.setDelivery_address("北京汇福油厂");
        pdfData.setCustomer_payments_name("");
        pdfData.setCustomer_payments_china_id("");
        strToHtml(PdfTemplateEnum.TEMPLATE_ENUM1.getMemo(), pdfData);
    }


    /**
     * @param str     html 模板
     * @param pdfData 数据
     * @throws FileNotFoundException
     */
    public static void strToHtml(String str, PDFData pdfData) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("hetong.html"));//路径默认在项目根目录下
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>");
        str = getstr(str, pdfData);
        sb.append(str);
        sb.append("</body>\n" +
                "</html>");
        printStream.println(str);

    }

    /**
     * 填充数据
     *
     * @param str
     * @return
     */
    private static String getstr(String str, PDFData pdfData) {
        //去除换行
        str.replace("\\n\"+\"", "");

        str = str.replace("#contract_number#", pdfData.getContract_number());
        str = str.replace("#sign_address#", pdfData.getSign_address());
        str = str.replace("#sign_time#", pdfData.getSign_time());
        str = str.replace("#customers_name#", pdfData.getCustomers_name());
        str = str.replace("#buyer_phone#", pdfData.getBuyer_phone());
        str = str.replace("#buyer_contract_name#", pdfData.getBuyer_contract_name());
        str = str.replace("#good_tons#", pdfData.getGood_tons());
        str = str.replace("#good_name#", pdfData.getGood_name());
        str = str.replace("#good_num#", pdfData.getGood_num());
        str = str.replace("#good_price#", pdfData.getGood_price());
        str = str.replace("#good_num#", pdfData.getGood_num());
        str = str.replace("#contract_total_price#", pdfData.getContract_total_price());
        str = str.replace("#contract_remark#", pdfData.getContract_remark());
        str = str.replace("#rmb#", pdfData.getRmb());
        str = str.replace("#egg_attr#", pdfData.getEgg_attr());
        str = str.replace("#cash_money#", pdfData.getCash_money());
        str = str.replace("#delivery_start_time#", pdfData.getDelivery_start_time());
        str = str.replace("#delivery_end_time#", pdfData.getDelivery_end_time());
        str = str.replace("#delivery_address#", pdfData.getDelivery_address());
        str = str.replace("#customer_payments_name#", pdfData.getCustomer_payments_name());
        str = str.replace("#customer_payments_china_id#", pdfData.getCustomer_payments_china_id());

        return str;
    }


}