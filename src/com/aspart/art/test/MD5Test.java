package com.aspart.art.test;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Test {

        private static final String ALGORITHM = "MD5";
        private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                        'e', 'f' };

        public static String encodeByMD5(String str) throws NoSuchAlgorithmException {

                if (str == null || str.equals("") || str == "") {
                        return null;
                }

                MessageDigest md = MessageDigest.getInstance(ALGORITHM);
                md.update(str.getBytes());

                return getFormattedText(md.digest());
        }

        private static String getFormattedText(byte[] bytes) {
                int len = bytes.length;
                StringBuilder buf = new StringBuilder(len * 2);
                // 把密文转换成十六进制的字符串形式
                for (int j = 0; j < len; j++) {
                        buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
                        buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
                }
                return buf.toString();
        }

        public static void main(String[] args) {
                try {
                        System.out.println("123456 MD5: " + MD5Test.encodeByMD5("123456"));
                } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                }
        }
}
