package com.aspart.art.collection;

import java.util.LinkedList;

import com.aspart.art.fio.Hero;

public class LinkedListTest {

        public static void main(String[] args) {
                
                LinkedList<Hero> ll = new LinkedList<>();
                ll.addLast(new Hero("hero1", 123));
                ll.addLast(new Hero("hero2", 125));
                ll.addLast(new Hero("hero3", 320));
                ll.addFirst(new Hero("heroX", 231));
                System.out.println(ll);
                
                System.out.println(ll.getFirst());
                System.out.println(ll.getLast());
                
                System.out.println(ll);
                System.out.println(ll.removeFirst());
                System.out.println(ll.removeLast());
                System.out.println(ll);
                
        }
}
