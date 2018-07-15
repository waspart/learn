package com.aspart.art.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class LambdaTest {

        private static void filter(List<Hero> heros){
                for(Hero h : heros){
                        if(h.hp > 100 && h.damage < 50){
                                System.out.println(h.toString());
                        }
                }
        }
        
        private static void filter(List<Hero> heros, HeroChecker checker){
                for(Hero h: heros){
                        if(checker.test(h)){
                                System.out.println(h);
                        }
                }
        }
        
        public static void main(String[] args) {
                Random rand = new Random();
                List<Hero> heros = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                        heros.add(new Hero("hero" + i, rand.nextInt(1000), rand.nextInt(100)));
                }
                System.out.println("初始化后的集合：");
                System.out.println(heros);
                /*System.out.println("筛选出hp > 100 && damage < 50的英雄：");
                 * filter(heros);
                 * */
                System.out.println("使用匿名类的方法：");
                HeroChecker checker = new HeroChecker() {
                        
                        @Override
                        public boolean test(Hero h) {
                                // TODO Auto-generated method stub
                                return (h.hp>100 && h.damage<50);
                        }
                };
                filter(heros, checker);
                
                System.out.println("使用lambda函数：");
                filter(heros, h->h.hp>100 && h.damage<50);
        }
}
