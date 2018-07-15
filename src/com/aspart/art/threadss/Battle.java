package com.aspart.art.threadss;

public class Battle implements Runnable
{
        
        private Hero h1;
        private Hero h2;
        private int interval;
        
        public Battle(Hero h1, Hero h2, int interval){
                this.h1 = h1;
                this.h2 = h2;
                this.interval = interval;
                
        }

        @Override
        public void run()
        {
                while(!h2.isDead()){
                        h1.attackHero(h2);
                }

        }

}
