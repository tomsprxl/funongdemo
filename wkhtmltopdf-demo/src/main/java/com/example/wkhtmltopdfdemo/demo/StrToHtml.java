package com.example.wkhtmltopdfdemo.demo;

import com.example.wkhtmltopdfdemo.dao.PDFData;
import com.example.wkhtmltopdfdemo.pdftemplateenum.PdfTemplateEnum;
import com.example.wkhtmltopdfdemo.util.FilePathUtil;

import java.io.File;
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
        String strToHtmlPath = strToHtml(PdfTemplateEnum.TEMPLATE_ENUM1.getMemo(), pdfData);
        System.out.println("strToHtmlPath = " + strToHtmlPath);
    }

    /**
     * @param str     html 模板
     * @param pdfData 数据
     * @throws FileNotFoundException
     */
    public static String strToHtml(String str, PDFData pdfData) {
        String htmlPath = FilePathUtil.getHtmlPath();
        PrintStream printStream = null;

        if (createDirectory(FilePathUtil.getFilePath())) {
            try {
                printStream = new PrintStream(new FileOutputStream(htmlPath));//路径默认在项目根目录下
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "   <title>PDF合同</title>\n" +
                "</head>\n" +
                "<body>");
        str = getStr(str, pdfData);
        sb.append(str);
        sb.append("</body>\n" +
                "</html>");
        printStream.println(sb.toString());

        return htmlPath;
    }

    /**
     * 填充数据
     *
     * @param str
     * @return
     */
    private static String getStr(String str, PDFData pdfData) {


        str = str.replace("\\r", "");
        str = str.replace("\\t", "");
        str = str.replace("\\n", "");
        str = str.replace("\\", "");


        str = str.replaceAll("#contract_number#", pdfData.getContract_number());
        str = str.replaceAll("#sign_address#", pdfData.getSign_address());
        str = str.replaceAll("#sign_time#", pdfData.getSign_time());
        str = str.replaceAll("#customers_name#", pdfData.getCustomers_name());
        str = str.replaceAll("#buyer_phone#", pdfData.getBuyer_phone());
        str = str.replaceAll("#buyer_contract_name#", pdfData.getBuyer_contract_name());
        str = str.replaceAll("#good_tons#", pdfData.getGood_tons());
        str = str.replaceAll("#good_name#", pdfData.getGood_name());
        str = str.replaceAll("#good_num#", pdfData.getGood_num());
        str = str.replaceAll("#good_price#", pdfData.getGood_price());
        str = str.replaceAll("#good_num#", pdfData.getGood_num());
        str = str.replaceAll("#contract_total_price#", pdfData.getContract_total_price());
        str = str.replaceAll("#contract_remark#", pdfData.getContract_remark());
        str = str.replaceAll("#rmb#", pdfData.getRmb());
        str = str.replaceAll("#egg_attr#", pdfData.getEgg_attr());
        str = str.replaceAll("#cash_money#", pdfData.getCash_money());
        str = str.replaceAll("#delivery_start_time#", pdfData.getDelivery_start_time());
        str = str.replaceAll("#delivery_end_time#", pdfData.getDelivery_end_time());
        str = str.replaceAll("#delivery_address#", pdfData.getDelivery_address());
        str = str.replaceAll("#customer_payments_name#", pdfData.getCustomer_payments_name());
        str = str.replaceAll("#customer_payments_china_id#", pdfData.getCustomer_payments_china_id());

        return str;
    }


    private static boolean createDirectory(String folder) {
        File dir = new File(folder);
        if (dir.exists()) {
            return true;
        } else {
            return dir.mkdirs();
        }
    }


}