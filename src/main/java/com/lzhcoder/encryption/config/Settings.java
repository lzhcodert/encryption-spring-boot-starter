package com.lzhcoder.encryption.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: PeterLiu
 * @Date: 2024/5/20 0:41
 * @Description: 扫描配置文件中以encrypt开头的配置项，获取到需要的加密类型
 */
@Component
@ConfigurationProperties(prefix = "encrypt")
public class Settings {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
