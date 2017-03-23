package cn.xuqplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuqplus on 17-3-22.
 *
 * @RestController equals to @Controller + @ResponseBody
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
     * @param request
     * @return
     */
    @RequestMapping("filter")
    public Map filter(HttpServletRequest request) {
        Map result = new HashMap();
        result.put("status", "success");
        String filter = (String) request.getAttribute("filter");
        result.put("filter", filter);
        return result;
    }
}
