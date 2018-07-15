package com.aspart.art.fio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {

        public static void main(String[] args) {

                String path = "d:\\file\\lol.txt";
                File lol = new File(path);
                System.out.println(lol.isFile());
                try (
                                FileReader fr_lol = new FileReader(lol);
                                BufferedReader br = new BufferedReader(fr_lol);
                                ) {
                        while (true) {
                                String line =  br.readLine();
                                if (null == line) {
                                        break;
                                }
                                System.out.println(line);
                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }

                String wpath = "d:\\file\\an.txt";
                File wlol = new File(wpath);
                try (
                                FileWriter fw_lol = new FileWriter(wlol);
                                BufferedWriter bw = new BufferedWriter(fw_lol);
                                ) {
                        for (int i = 0; i < 5; i++) {
                                String line = "line " + i + "\r\n";
                                bw.write(line);
                        }

                } catch (IOException e) {

                }
        }
}
