package com.lzhcoder.encryption.service.impl;

import com.lzhcoder.encryption.service.Encryption;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: PeterLiu
 * @Date: 2024/5/20 0:33
 * @Description: 基于SHA256算法加密数据
 */
public class ShaEncryption implements Encryption {

    private static final Logger logger = LoggerFactory.getLogger(ShaEncryption.class);

    @Override
    public String encryptText(String inputRow) {
        logger.info("基于SHA256算法加密数据");
        return DigestUtils.sha256Hex(inputRow);
    }

}
