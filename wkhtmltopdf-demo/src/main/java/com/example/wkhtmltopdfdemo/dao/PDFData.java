package com.example.wkhtmltopdfdemo.dao;

import lombok.Data;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-02 15:28
 */
@Data
public class PDFData {

    private String contract_number;//合同编号
    private String sign_address;
    private String sign_time;
    private String customers_name;//甲方名称
    private String buyer_phone;
    private String buyer_contract_name;
    private String good_tons; //good_unit
    private String good_name;
    private String good_num;
    private String good_price;
    private String contract_total_price;
    private String contract_remark;
    private String rmb;
    private String egg_attr;
    private String cash_money;
    private String delivery_start_time;
    private String delivery_end_time;
    private String delivery_address;
    private String customer_payments_name;
    private String customer_payments_china_id;



}