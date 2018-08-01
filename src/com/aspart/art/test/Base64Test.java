package com.aspart.art.test;


import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.UUID;


public class Base64Test {
        public static void main(String args[]) throws ParseException {

                String username = "aspart";
                String password = "123456";
                String createTime = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss:SSS").format(new Date());

                try {
                        
                        String base64_username = Base64.getEncoder().encodeToString(username.getBytes("utf-8"));
                        String base64_password = Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
                        String base64_createTime = Base64.getEncoder().encodeToString(createTime.getBytes("utf-8"));

                        System.out.println(base64_username + "." + base64_password + "." + base64_createTime);

//                        System.out.println(base64_createTime.length());
//                        System.out.println(base64_password.length());
//                        System.out.println(base64_username.length());

                        System.out.println(base64_createTime);

                        Random random = new Random();
                        System.out.println(random.nextInt(base64_password.length()));
                        StringBuilder sb_index_char = new StringBuilder();
                        for (int i = 0; i < 8; i++) {
                                if (i < 4) {
                                        sb_index_char.append(base64_password
                                                        .charAt(random.nextInt(base64_username.length())));
                                } else {
                                        sb_index_char.append(base64_username
                                                        .charAt(random.nextInt(base64_password.length())));
                                }
                        }
                        System.out.println(sb_index_char);

                        StringBuilder sb_bas64_createTime = reverse(base64_createTime);
                        int sb_length = sb_bas64_createTime.length();
                        for (int i = 4, j = 0; i <= sb_length + 8; i += 5, j++) {
                                sb_bas64_createTime.insert(i, sb_index_char.charAt(j));
                        }
                        System.out.println(sb_bas64_createTime.toString().toLowerCase());
                        
                        char[] arr = new char[12];
                        for (int i = 0; i < 12; i++) {
                                int seed = random.nextInt(122);
                                if(seed >= 48 && seed <=57 || seed >= 65 && seed <= 90 || seed >= 97 && seed <= 122) {
                                        arr[i] = ((char)seed);
                                }else{
                                        
                                }
                                arr[i] = (char)random.nextInt(12);
                        }
                        System.out.println(arr);
                        
                        System.out.println((int) 'a');
                        System.out.println((int) 'z');
                        System.out.println((int) 'A');
                        System.out.println((int) 'Z');
                        System.out.println((int) '0');
                        System.out.println((int) '9');
                        
                        System.out.println(UUID.randomUUID());

//                        System.out.println(repair(sb_bas64_createTime));
//                        String str_repair = reverse(repair(sb_bas64_createTime).toString()).toString();
//                        System.out.println(str_repair.toLowerCase());
//
//                        String time_repair = new String(Base64.getDecoder().decode(str_repair));
//                        System.out.println(time_repair);
//
//                        Date time = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss:SSS").parse(time_repair);
//                        System.out.println(time);

                } catch (UnsupportedEncodingException e) {
                        System.out.println("Error :" + e.getMessage());
                }
        }

        // 翻转一个string
        public static StringBuilder reverse(String str) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                        result.append(str.charAt(str.length() - i - 1));
                }

                return result;

        }

        public static StringBuilder repair(StringBuilder sb) {
                int length = sb.length();
                for (int i = length - 1; i > 0; i -= 5) {
                        sb.deleteCharAt(i);
                }

                return sb;
        }

}
