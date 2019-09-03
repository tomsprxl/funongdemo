package com.example.wkhtmltopdfdemo.demo;

import com.example.wkhtmltopdfdemo.dao.PDFData;
import com.example.wkhtmltopdfdemo.pdftemplateenum.PdfTemplateEnum;
import com.example.wkhtmltopdfdemo.util.FilePathUtil;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-03 14:08
 */
public class TestDemo {
    public static void main(String[] args) {
        //字符串转html
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
        String strToHtmlPath = StrToHtml.strToHtml(PdfTemplateEnum.TEMPLATE_ENUM1.getMemo(), pdfData);

        //HTML 转pdf
        String pdfPath = HtmlToPdf.convert(strToHtmlPath, FilePathUtil.getPdfPath());


        //pdf 转 png
        String imagePath = PDF2IMAGE.pdf2Image(pdfPath, FilePathUtil.getFilePath(), 300);

        System.out.println("strToHtmlPath = " + strToHtmlPath);
        System.out.println("pdfPath = " + pdfPath);
        System.out.println("imagePath = " + imagePath);


    }

}