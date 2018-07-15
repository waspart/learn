package com.aspart.art.fio;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLine {

        public static void main(String[] args) {

                File f = new File("d:\\file\\words.txt");
                try (
                                FileReader fr = new FileReader(f);
                                BufferedReader br = new BufferedReader(fr);
                                ) {

                        int total = 0;
//                        String line = br.readLine();
                        while(true){
                                String line = br.readLine();
                                if(null == line)        break;
                                System.out.println(line);
                                total++;
                        }
                        System.out.println(total);
                        
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}
