package cn.tfliu.springframe.aop.aoprealize.impl.cglibproxy;

import cn.tfliu.springframe.aop.aoprealize.impl.Person;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * CGLIB的代理，是生成代理类的形式，但具有局限性，对于无法生成子类的类（final类），肯定是没有办法生成代理子类的。
 */
public class PersonProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before Proxy");
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("After Proxy");
        return result;
    }

    public static Person getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new PersonProxy());
        return (Person) enhancer.create();
    }

    public static void main(String[] args) {
        Person proxyInstance = getProxyInstance();
        proxyInstance.doSomething();
        proxyInstance.doSomething2();
    }
}
