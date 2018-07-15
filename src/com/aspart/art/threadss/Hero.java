package com.aspart.art.threadss;


public class Hero {

        public String name;
        public float hp;
        public int damage;

        public Hero() {

        }

        public Hero(String name, float hp, int damage) {
                this.name = name;
                this.hp = hp;
                this.damage = damage;
        }

        public synchronized void recover() throws InterruptedException {
                this.hp++;
                System.out.printf("%s 加血1点,加血后，%s的血量是%.0f%n", name, name, hp);
                if (this.hp >= 100) {
                        this.wait();
                }
//                this.notify();
        }

        public synchronized void hurt() throws InterruptedException {
                if (this.hp == 1) {
                        this.wait();
                }else {
                        this.notify();
                }
                this.hp--;
                System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);

        }

        public void attackHero(Hero h) {
                h.hp -= this.damage;
                System.out.format("%s 正在攻击 %s， %s 的血变成了 %.2f%n", this.name, h.name, h.name, h.hp);
                if (h.isDead()) {
                        System.out.println(h.name + "  死了！");
                }
        }

        public boolean isDead() {
                return this.hp > 0 ? false : true;
        }
}
