package com.lzhcoder.encryption.config;

import com.lzhcoder.encryption.service.Encryption;
import com.lzhcoder.encryption.service.impl.MD5Encryption;
import com.lzhcoder.encryption.service.impl.ShaEncryption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: PeterLiu
 * @Date: 2024/5/20 0:48
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(value = Settings.class)
public class EncryptConfig {

    public static final Logger logger = LoggerFactory.getLogger(EncryptConfig.class);

    @Bean
    @ConditionalOnProperty(prefix = "encrypt", name = "type", havingValue = "MD5")//匹配配置文件中的encrypt.type= MD5
    public Encryption md5Encrypt() {
        logger.info("加载md5Encrypt");
        return new MD5Encryption();
    }

    @Bean
    @ConditionalOnProperty(prefix = "encrypt", name = "type", havingValue = "SHA256")
    public Encryption sha256Encrypt() {
        logger.info("加载sha256Encrypt");
        return new ShaEncryption();
    }
}
