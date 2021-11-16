package cn.tfliu.springframe.aop.know;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 目标类
 */
@Component
public class TargetClass {

    public String test(String value) {
        System.out.println("目标方法test被执行");
        if (!StringUtils.hasLength(value)) {
            throw new RuntimeException("value不能为空");
        }
        return value;
    }
}
