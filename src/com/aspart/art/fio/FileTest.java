package com.aspart.art.fio;

import java.io.File;

public class FileTest {

        public static void main(String[] args) {
                File f = new File("C:/Windows/splwow64.exe");
                System.out.println(f.getAbsolutePath());
                System.out.println(f.length());

                long max = Integer.MIN_VALUE;
                long min = Integer.MAX_VALUE;
                File max_file = null;
                File min_file = null;
                // System.out.println(f.isDirectory());
                // System.out.println(f.isFile());
                // System.out.println("文件总数为：" + f.list().length);

                File fd = new File(f.getParent());
                System.out.println(fd.getAbsolutePath());
                for (String item : fd.list()) {
                        File item_file = new File(f.getParent() + File.separator + item);
                        System.out.println(item);
//                         System.out.println(item_file.length());
                        if (item_file.length() > 0) {
                                if (item_file.length() > max) {
                                        max_file = item_file;
                                        max = max_file.length();
                                        System.out.println(max);
                                }
                                if (item_file.length() < min) {
                                        min_file = item_file;
                                        min = min_file.length();
                                }
                        }
                }

                System.out.println("最大的文件：" + max_file.getAbsolutePath());
                System.out.println("最小的文件：" + min_file.getAbsolutePath());
                System.out.println("文件总数为：" + fd.list().length);

                System.out.println(min);
                System.out.println(max);

        }

}
