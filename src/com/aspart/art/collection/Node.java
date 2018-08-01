package com.aspart.art.collection;


import java.util.ArrayList;
import java.util.List;


public class Node {
        public Node leftNode;
        public Node rightNode;
        public Object value;

        public void add(Object val) {
                if (value == null) {
                        value = val;
                } else {
                        if ((Integer) val - (Integer) value <= 0) {
                                if (null == leftNode) {
                                        leftNode = new Node();
                                }
                                leftNode.add(val);
                        } else {
                                if (null == rightNode) {
                                        rightNode = new Node();
                                }
                                rightNode.add(val);
                        }
                }
        }

        public List<Object> values() {
                List<Object> values = new ArrayList<>();

                if (null != leftNode) {
                        values.addAll(leftNode.values());
                }
                values.add(value);
                if (null != rightNode) {
                        values.addAll(rightNode.values());
                }

                return values;
        }

        public static void main(String[] args) {
                int[] rands = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
                Node roots = new Node();
                for (int num : rands) {
                        roots.add(num);
                }
                System.out.println(roots.values());
        }

}