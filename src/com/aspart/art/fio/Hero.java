/**
 * 
 */
package com.aspart.art.fio;


import java.io.Serializable;

/**
 * @author aspart
 *
 */
public class Hero implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = -1613051653945779321L;
        private String name;
        private float hp;

        public Hero(String name, float hp){
                this.name = name;
                this.hp = hp;
        }
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

        @Override
        public String toString() {
                return "Hero [name=" + name + ", hp=" + hp + "]";
        }
        /**
         * @param args
         */
        public static void main(String[] args) {
                // TODO Auto-generated method stub

        }

}
