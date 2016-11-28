package com.gek;

/**
 * Created by KAY on 2016/11/7.
 */
public class Cat implements Animal {
    @Override
    public String sayWord() {
        return "cat";
    }

    @Override
    public void doMySelf() {
        System.out.println("im cat");
    }

    @Override
    public void eatSomething() {
        System.out.println("eat fish");
    }

    @Override
    public void test() {

    }
}
