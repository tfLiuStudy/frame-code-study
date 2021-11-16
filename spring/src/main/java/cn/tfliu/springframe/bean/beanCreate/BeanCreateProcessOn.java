package cn.tfliu.springframe.bean.beanCreate;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreateProcessOn {
    public static void main(String[] args) {
        AbstractXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = classPathXmlApplicationContext.getBean(Teacher.class);
    }
}
