package com.lzhcoder.encryption.service.impl;

import com.lzhcoder.encryption.service.Encryption;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author: PeterLiu
 * @Date: 2024/5/20 0:25
 * @Description: 基于MD5算法加密数据的实现类
 */
public class MD5Encryption implements Encryption {

    private static final Logger logger = LoggerFactory.getLogger(MD5Encryption.class);

    @Override
    public String encryptText(String inputRow) {
        logger.info("基于MD5算法加密数据");
        return DigestUtils.md5Hex(inputRow);
    }
}
