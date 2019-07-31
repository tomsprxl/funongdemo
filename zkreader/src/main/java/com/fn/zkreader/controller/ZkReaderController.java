package com.fn.zkreader.controller;

import com.fn.zkreader.model.IdentityCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zkteco.id100com.jni.id100sdk;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-07-31 9:38
 */
@RestController
@RequestMapping("/zkReader")
public class ZkReaderController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 自动搜索并连接身份证阅读器
     *
     * @return 成功返回设备端口（串口:1~16;USB:1001~1016）
     * 失败返回0
     */
    @GetMapping("/searchReader")
    public ResponseEntity<Boolean> initCommExt() {

        try {
            int i = id100sdk.InitCommExt();

            if (i == 0) {
                logger.info("自动搜索并连接身份证阅读器失败!");
                return ResponseEntity.ok(false);
            } else {
                logger.info("自动搜索并连接身份证阅读器成功!");
                return ResponseEntity.ok(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    /**
     * 断开与身份证阅读器连接
     *
     * @return 成功返回1
     * 失败返回0
     */
    @GetMapping("/closeZkReader")
    public ResponseEntity<Boolean> closeComm() {


        try {
            int i = id100sdk.CloseComm();

            if (i == 0) {
                logger.info("断开与身份证阅读器连接失败!");
                return ResponseEntity.ok(false);
            } else {
                logger.info("断开与身份证阅读器连接成功!");
                return ResponseEntity.ok(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * 查询身份证信息
     *
     * @return
     */
    @GetMapping("/selectIdentityCard")
    public ResponseEntity<IdentityCard> selectIdentityCard() {
        IdentityCard identityCard = new IdentityCard();
        //认证卡
        if (id100sdk.Authenticate() != 1) {
            logger.info("认证卡失败!");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        logger.info("认证卡成功!");

        //循环读取
        long tickStart = System.currentTimeMillis();
        int ret = 0;
        while ((ret = id100sdk.ReadContent(1)) != 1 && System.currentTimeMillis() < 2000) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        identityCard.setName(id100sdk.getName());
        identityCard.setNation(id100sdk.getNation());
        identityCard.setSex(id100sdk.getSex());
        identityCard.setIdNum(id100sdk.getIDNum());
        identityCard.setBirthdate(id100sdk.getBirthdate());
        identityCard.setAddress(id100sdk.getAddress());
        identityCard.setIssue(id100sdk.getIssue());
        identityCard.setEffectedDate(id100sdk.getEffectedDate());
        identityCard.setExpireDate(id100sdk.getExpireDate());
//        identityCard.setBmpPhotoBase64(id100sdk.getBMPPhotoBase64());
//        identityCard.setJpgPhotoBase64(id100sdk.getJPGPhotoBase64());
        logger.info("身份证信息读取成功!");
        return ResponseEntity.ok(identityCard);
    }


}