package com.yujr.cms.commons;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class CodecUtils {
    private CodecUtils() {

    }

    /**
     * md5散列
     *
     * @param src 源字符串
     * @return 散列之后的字符串
     */
    public static String md5(String src) {
        return DigestUtils.md5DigestAsHex(src.getBytes(StandardCharsets.UTF_8));
    }
}
