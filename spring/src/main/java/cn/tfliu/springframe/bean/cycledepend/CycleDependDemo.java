package cn.tfliu.springframe.bean.cycledepend;

import cn.tfliu.springframe.bean.beanCreate.Teacher;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleDependDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        AbstractXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = classPathXmlApplicationContext.getBean(A.class);
        B bean = classPathXmlApplicationContext.getBean(B.class);
        System.out.println(a);

//        A a = A.class.newInstance();
//        B b = B.class.newInstance();
//        System.out.println(a);
    }
}
