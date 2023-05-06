package com.chelayel.singleton;

public class SingletonMain {

    public static void main(String... args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setInfo("Hello");

        System.out.println(singleton1.getInfo());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getInfo());

    }
}
