package com.aspart.art.code;

import java.io.UnsupportedEncodingException;

public class CodeTest {

        private static String str = "中国";
        
        public static void main(String[] args) {
                showCode(str);
        }
        
        private static void showCode(String str) {
                String[] encodes = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };
                for (String encode : encodes) {
                    showCode(str, encode);
                }
         
            }
         
            private static void showCode(String str, String encode) {
                try {
                    System.out.printf("汉语: \"%s\" 编码为%s的表示%n", str, encode);
                    byte[] bs = str.getBytes(encode);
         
                    for (byte b : bs) {
                        int i = b&0xff;
                        System.out.print(Integer.toHexString(i) + "\t");
                    }
                    System.out.println();
                    System.out.println();
                } catch (UnsupportedEncodingException e) {
                    System.out.printf("UnsupportedEncodingException: %s编码出错%s\n", encode, str);
                }
            }
}
