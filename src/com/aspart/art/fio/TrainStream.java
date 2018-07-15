package com.aspart.art.fio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TrainStream {

        public static void main(String[] args) {
                
                List<Hero> lst_hero = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                        Hero h = new Hero("hero " + i, i*10+100);
//                        h.setHp(i * 10 + 100);
//                        h.setName("hero " + i);
                        lst_hero.add(h);
                }
                
                File f = new File("d:\\file\\heros.lol");
                try(
                                FileOutputStream fos = new FileOutputStream(f);
                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                FileInputStream fis = new FileInputStream(f);
                                ObjectInputStream ois = new ObjectInputStream(fis);
                                
                                ){
                        /*
                        for(Hero h : lst_hero){
                                oos.writeObject(h);
                        }*/
                        oos.writeObject(lst_hero);
                        
                        List<Hero> lst_new = (List<Hero>) ois.readObject();
                        for(Hero h : lst_new){
                                System.out.println("Ãû×Ö£º" + h.getName() + "\tÑªÁ¿£º" + h.getHp());
                        }
                        
                }catch(IOException e){
                        e.printStackTrace();
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
                
        }
}
