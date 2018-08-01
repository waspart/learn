package com.aspart.art.test;


public class PlusTest {

        public static void main(String[] args) {
                boolean b = true;
                String str = " i am a boy";
                System.out.println(str + b);

                int a = 0;
                try {
                        int c = 10 / a;
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }

                System.out.println("i am here");
                System.out.println(getStr());
        }
        
        
        public static String getStr() {
                
                int a = 0;
                try {
                        int c = 10 / a;
                }catch(Exception e) {
                        System.out.println(e.getMessage());
                        return "an exception";
                }
                
                return "i am a string";
        }
}
