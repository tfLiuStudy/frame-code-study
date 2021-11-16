package cn.tfliu.springframe.aop.aoprealize.impl;

import cn.tfliu.springframe.aop.aoprealize.IPerson;

public class Person implements IPerson {

    @Override
    public void doSomething(){
        System.out.println("I want wo sell this house");
    }

    @Override
    public void doSomething2() {
        System.out.println("-----------doSomething2-----------");
    }
}
