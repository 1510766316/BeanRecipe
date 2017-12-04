package com.wgx.love.beanrecipe.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class StringTool {

    /**
     * @Describe 判断字符串是否为空
     * <p>
     * Create at 2016/9/10 14:59
     */
    public static boolean isEmpty(Object input) {

        return input == null || input.toString().trim().length() == 0 || "null".equals(input.toString().trim());
    }

    /**
     * @Describe 字符串转码UTF-8
     * <p>
     * Create at 2016/9/10 15:03
     */
    public static String utf8Encode(String str) {

        if (!isEmpty(str) && str.getBytes().length != str.length()) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UnsupportedEncodingException occurred. ", e);
            }
        }
        return str;
    }

    /**
     * @Describe 是否包含表情字符
     * <p>
     * Create at 2016/9/10 14:55
     */
    public static boolean containsEmoji(String source) {
        int len = source.length();
        for (int i = 0; i < len; i++) {
            char codePoint = source.charAt(i);
            if (!isEmojiCharacter(codePoint)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @Describe 是否是表情文字
     * <p>
     * Create at 2016/9/10 14:55
     */
    private static boolean isEmojiCharacter(char codePoint) {
        return (codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) || (codePoint == 0xD)
                || ((codePoint >= 0x20) && (codePoint <= 0xD7FF)) || ((codePoint >= 0xE000) && (codePoint <= 0xFFFD))
                || ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));
    }
}
