package com.aspart.art.lambda;

public class Hero implements Comparable<Hero>{

        public String name;
        public float hp;
        public int damage;
        
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public float getHp() {
                return hp;
        }

        public void setHp(float hp) {
                this.hp = hp;
        }

        public int getDamage() {
                return damage;
        }

        public void setDamage(int damage) {
                this.damage = damage;
        }

        public Hero(String name, float hp, int damage){
                this.name = name;
                this.hp = hp;
                this.damage = damage;
        }
        
        @Override
        public String toString() {
                return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\n";
        }

        @Override
        public int compareTo(Hero o) {
                if(this.damage < o.damage){
                        return 1;
                }else{
                        return -1;
                }
        }

}
