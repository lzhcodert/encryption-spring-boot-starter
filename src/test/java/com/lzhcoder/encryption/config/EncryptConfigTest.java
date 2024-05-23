package com.lzhcoder.encryption.config;

import com.lzhcoder.encryption.service.Encryption;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: PeterLiu
 * @Date: 2024/5/20 0:59
 * @Description:
 */
@SpringBootTest
class EncryptConfigTest {

    @Resource
    private Encryption encryption;

    @Test
    void md5Test(){
        System.out.println("encryption.encryptText(\"peterliu\") = " + encryption.encryptText("peterliu"));
    }

}