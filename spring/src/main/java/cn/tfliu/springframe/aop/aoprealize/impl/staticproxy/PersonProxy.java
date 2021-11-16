package cn.tfliu.springframe.aop.aoprealize.impl.staticproxy;

import cn.tfliu.springframe.aop.aoprealize.IPerson;
import cn.tfliu.springframe.aop.aoprealize.impl.Person;

/**
 * 通过代理类我们实现了将日志代码集成到了目标类，但从上面我们可以看出它具有很大的局限性：
 * 需要固定的类编写接口（或许还可以接受，毕竟有提倡面向接口编程），需要实现接口的每一个函数（不可接受），
 * 同样会造成代码的大量重复，将会使代码更加混乱。
 */
public class PersonProxy {

    private IPerson iPerson;

//    private final static Logger logger = LoggerFactory.getLogger(PersonProxy.class);

    public PersonProxy(IPerson iPerson) {
        this.iPerson = iPerson;
    }
    public void doSomething() {
        System.out.println("Before Proxy");
        iPerson.doSomething();
        System.out.println("After Proxy");
    }

    public static void main(String[] args) {
        PersonProxy personProxy = new PersonProxy(new Person());
        personProxy.doSomething();
    }

}
