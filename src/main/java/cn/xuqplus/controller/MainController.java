package cn.xuqplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuqplus on 17-3-22.
 * @RestController equals to @Controller + @ResponseBody
 */
@RestController
@RequestMapping(value = "/api")
public class MainController {
    @RequestMapping("")
    public Map demo(){
        Map result = new HashMap();
        result.put("status", "success");
        result.put("message", "hello spring boot");
        return result;
    }
}
