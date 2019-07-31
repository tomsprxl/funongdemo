package com.fn.zkreader.model;

/**
 * 描述:
 * 身份证实体类
 *
 * @author xuliang
 * @create 2019-07-31 9:47
 */

public class IdentityCard {

    //姓名
    private String name;

    //民族
    private String nation;

    //性别
    private String sex;

    //身份证号
    private String idNum;

    //出生日期
    private String birthdate;

    //常住地址
    private String address;

    //签发机关
    private String issue;

    //获取有效期起始日期(YYYYMMDD)
    private String effectedDate;

    //获取有效期截止日期
    private String expireDate;

    //获取bmp图片base64编码
    private String bmpPhotoBase64;

    //获取JPG头像Base64编码
    private String jpgPhotoBase64;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getEffectedDate() {
        return effectedDate;
    }

    public void setEffectedDate(String effectedDate) {
        this.effectedDate = effectedDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getBmpPhotoBase64() {
        return bmpPhotoBase64;
    }

    public void setBmpPhotoBase64(String bmpPhotoBase64) {
        this.bmpPhotoBase64 = bmpPhotoBase64;
    }

    public String getJpgPhotoBase64() {
        return jpgPhotoBase64;
    }

    public void setJpgPhotoBase64(String jpgPhotoBase64) {
        this.jpgPhotoBase64 = jpgPhotoBase64;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", sex='" + sex + '\'' +
                ", idNum='" + idNum + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", issue='" + issue + '\'' +
                ", effectedDate='" + effectedDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", bmpPhotoBase64='" + bmpPhotoBase64 + '\'' +
                ", jpgPhotoBase64='" + jpgPhotoBase64 + '\'' +
                '}';
    }
}