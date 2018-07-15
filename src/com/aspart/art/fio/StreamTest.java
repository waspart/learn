package com.aspart.art.fio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

        private static FileInputStream fis;
        private static FileOutputStream fos;

        public static void main(String[] args) {
                /*
                 * File fin = new File("D:\\python\\endict\\crawl.txt"); File
                 * fout = new File("D:\\python\\endict\\cout.txt"); try { fis =
                 * new FileInputStream(fin); byte[] fin_all = new byte[(int)
                 * fin.length()]; fis.read(fin_all); for (byte b : fin_all) {
                 * System.out.println(b); } fis.close(); } catch
                 * (FileNotFoundException e) { // TODO Auto-generated catch
                 * block e.printStackTrace(); } catch (IOException e) { // TODO
                 * Auto-generated catch block e.printStackTrace(); }
                 * 
                 * try { fos = new FileOutputStream(fout); byte[] fout_all =
                 * {88, 89}; fos.write(fout_all); fos.close(); } catch
                 * (FileNotFoundException e) { // TODO Auto-generated catch
                 * block e.printStackTrace(); } catch (IOException e) { // TODO
                 * Auto-generated catch block e.printStackTrace(); }
                 * 
                 * String path = "d:/xyz/abc/def"; String fileName = "lol2.txt";
                 * 
                 * File path_file = new File(path);
                 * if(!path_file.isDirectory()){ path_file.mkdirs(); }
                 */

                String path = "D:\\file\\eclipse.exe";
                File f = new File(path);
                try {
                        fis = new FileInputStream(f);
                        byte[] f_all = new byte[(int) f.length()];
                        fis.read(f_all);

                        int step = 1024 * 100;
                        for (int i = 0; i < f_all.length / step + 1; i++) {
                                String file_part_name = "D:\\file\\eclipse.exe" + i;
                                fos = new FileOutputStream(new File(file_part_name));
                                int start_ind = step * i;
                                // int end_ind = start_ind + step - 1;
                                if (start_ind + step - 1 < f_all.length) {
                                        fos.write(f_all, start_ind, step);
                                } else {
                                        fos.write(f_all, start_ind, f_all.length - start_ind);
                                }
                        }
                        fis.close();
                        fos.close();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

                try {
                        String save_path = "D:\\file\\other.exe";
                        fos = new FileOutputStream(new File(save_path));
                        for (int i = 0; i < 4; i++) {
                                String part_name = "D:\\file\\eclipse.exe" + i;
                                File f_part = new File(part_name);
                                fis = new FileInputStream(f_part);
                                byte[] b_part = new byte[(int) f_part.length()];
                                fis.read(b_part);
                                fos.write(b_part);
                        }
                        fis.close();
                        fos.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}
