package com.aspart.art.threadss;


public class KillThread extends Thread
{
        private Hero h1;
        private Hero h2;
        private int inter = 1000;

        public int getInter()
        {
                return inter;
        }

        public void setInter(int inter)
        {
                this.inter = inter;
        }

        public KillThread(Hero h1, Hero h2)
        {
                this.h1 = h1;
                this.h2 = h2;
        }

        public void run()
        {
                while (!h2.isDead())
                {
                        h1.attackHero(h2);
                }
        }
}
