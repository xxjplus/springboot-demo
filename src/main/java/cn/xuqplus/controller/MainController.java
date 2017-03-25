package cn.xuqplus.controller;

import cn.xuqplus.utils.PropertyUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuqplus on 17-3-22.
 * <p>
 * 注解 @RestController equals to @Controller + @ResponseBody
 */
@RestController
@RequestMapping(value = "/api")
public class MainController {
    @RequestMapping("")
    public Map demo() {
        Map result = new HashMap();
        result.put("status", "success");
        result.put("message", "hello spring boot");
        return result;
    }

    /**
     * 此接口功能为验证编写的filter
     * request在过滤器中添加一个属性,尝试在此取出并返回给client
     */
    @RequestMapping("filter")
    public Map filter(HttpServletRequest request) {
        Map result = new HashMap();
        result.put("status", "success");
        String filter = (String) request.getAttribute("filter");
        result.put("filter", filter);
        return result;
    }

    /**
     * 该接口功能为验证 application.properties配置信息的读取
     * 1.使用@Value注解,可以方便的在spring管理的类(如Controller/Service/Configuration/Component中)
     * 获取单个property,无需getter/setter,并且可以设置缺省值
     * 2.在非spring管理下的类中,获取properties文件内容
     * 可使用@Component
     * +@PropertySource("classpath:application.properties")
     * +@ConfigurationProperties(prefix = "property")等注解
     * 注意getter/setter必要且不能为static
     */
    @Value(value = "${property.demo:default}")
    private String property_demo;

    @RequestMapping("property")
    public Map property() {
        Map result = new HashMap();
        result.put("status", "success");
        result.put("property.demo", property_demo);
        result.put("PropertyUtil.demo", PropertyUtil.demo);
        result.put("PropertyUtil.map", PropertyUtil.map);
        return result;
    }
}
