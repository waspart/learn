package com.aspart.art.reflection;

import java.lang.reflect.Field;

public class ReflectionTest {

        public static void main(String[] args) {
                String className = "com.aspart.art.reflection.Hero";

                try {
//                        Class pc1 = Class.forName(className);
//                        Class pc2 = Hero.class;
//                        Class pc3 = new Hero().getClass();
//                        Class pc = Class.forName(className);
//                        Constructor c = pc.getConstructor();
//                        Hero h2 = (Hero) c.newInstance();
//                        System.out.println(h2);
                        Hero h = new Hero();
                        h.name = "garen";
                        Field f1 = h.getClass().getDeclaredField("name");
                        f1.set(h, "teemo");
                        System.out.println(h.name);
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                
                System.out.println(Integer.class == int.class);
                System.out.println(Integer.TYPE == int.class);
                
                
        }

}
