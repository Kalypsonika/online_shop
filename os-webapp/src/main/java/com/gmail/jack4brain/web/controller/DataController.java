package com.gmail.jack4brain.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * DataController...
 *
 * @author jack4brain@gmail.com
 */
@Controller
@RequestMapping("/rest")
public class DataController {

    @RequestMapping(value = "/data")
    public ModelAndView data(){
        ModelAndView modelAndView = new ModelAndView("restView");

        Map<String, String> map = new HashMap<>();
        map.put("username", "jeka");
        map.put("password", "123456");

        modelAndView.addObject("data", map);

        return modelAndView;
    }

}
