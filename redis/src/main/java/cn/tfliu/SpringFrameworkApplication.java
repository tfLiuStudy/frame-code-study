package cn.tfliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
//        TargetClass targetClass = context.getBean(TargetClass.class);
//        targetClass.test("aop");
    }
}
