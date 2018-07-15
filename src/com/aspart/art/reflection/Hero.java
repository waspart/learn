package com.aspart.art.reflection;

public class Hero {

        public String name;
        private float hp;
        private int damage;
        private int id;
        
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

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        static String copyright;
        
        static{
                System.out.println("初始化 copyright");
                copyright = "版权归Riot Games 公司所有";
        }

        @Override
        public String toString() {
                return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage
                                + ", id=" + id + "]";
        }
        
        public boolean isDead(){
                return false;
        }
        
        public void attackHero(Hero h2){
                System.out.println(this.name + "正在攻击 " + h2.getName());
        }
        
        
}
