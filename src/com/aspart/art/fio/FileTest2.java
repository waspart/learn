package com.aspart.art.fio;

import java.io.File;

public class FileTest2 {

        public static void main(String[] args) {
                String path = "https://www.alatinai.com/imgs";
                File f = new File(path);
                System.out.println(f.isDirectory());
        }
}
