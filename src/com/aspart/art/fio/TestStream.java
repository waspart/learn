package com.aspart.art.fio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream {

        public static void main(String[] args) {
                Hero h = new Hero("Garen", 616);
//                h.setName("Garen");
//                h.setHp(616);
                
                File f = new File("d:\\file\\garen.lol");
                try(
                                FileOutputStream fos = new FileOutputStream(f);
                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                
                                FileInputStream fis = new FileInputStream(f);
                                ObjectInputStream ois = new ObjectInputStream(fis);
                                ){
                        oos.writeObject(h);
                        Hero h2 = (Hero) ois.readObject();
                        System.out.println(h2.getName());
                        System.out.println(h2.getHp());
                }catch (Exception e) {

                        e.printStackTrace();
                }
                
                
        }
}
