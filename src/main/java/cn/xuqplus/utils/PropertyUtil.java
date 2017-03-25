package cn.xuqplus.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 该类为验证springboot下非spring管理的类中获取properties文件内容的注解方法
 * 注意
 * 1.成员变量应当与properties文件中属性同名
 * 2.成员变量可用static修饰以方便其他类获取
 * 3.getter/setter不可用static修饰(String类型成员变量好像例外)
 * Created by xuqplus on 17-3-25.
 */
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "property")
public class PropertyUtil {
    public static String demo;
    public static Map map;

    public void setDemo(String demo) {
        PropertyUtil.demo = demo;
    }

    public void setMap(Map map) {
        PropertyUtil.map = map;
    }

    public String getDemo() {
        return demo;
    }

    public Map getMap() {
        return map;
    }
}
