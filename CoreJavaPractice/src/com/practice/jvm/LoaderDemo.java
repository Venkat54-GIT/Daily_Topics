package com.practice.jvm;

public class LoaderDemo {
    public static void main(String[] args) {
        ClassLoader cl = LoaderDemo.class.getClassLoader();
        while (cl != null) {
            System.out.println(cl);
            cl = cl.getParent();
        }
    }
}

