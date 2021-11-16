package cn.tfliu.springframe.aop.aoprealize.impl.dynamicproxy;

import cn.tfliu.springframe.aop.aoprealize.IPerson;
import cn.tfliu.springframe.aop.aoprealize.impl.Person;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 它的好处理时可以为我们生成任何一个接口的代理类，并将需要增强的方法织入到任意目标函数。但它仍然具有一个局限性，就是只有实现了接口的类，才能为其实现代
 */
public class PersonProxy implements InvocationHandler {

    private Object delegate;

    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            System.out.println("Before Proxy");
            result = method.invoke(delegate, args);
            System.out.println("After Proxy");
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    public static void main(String[] args) {
        PersonProxy personProxy = new PersonProxy();
        IPerson iperson = (IPerson) personProxy.bind(new Person());
        iperson.doSomething();
        iperson.doSomething2();
    }
}
