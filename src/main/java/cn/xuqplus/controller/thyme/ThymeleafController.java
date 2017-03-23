package cn.xuqplus.controller.thyme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuqplus on 17-3-23.
 */
@Controller
@RequestMapping("/thyme")
public class ThymeleafController {
    @RequestMapping(value = "")
    public String thyme(ModelMap modelMap) {
        modelMap.addAttribute("name", "许小群");
        modelMap.addAttribute("id", "007");
        return "thyme";
    }
}
