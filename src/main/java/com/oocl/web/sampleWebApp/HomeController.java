package com.oocl.web.sampleWebApp;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String hello() {
        return "Hello World";
    }
    
    @RequestMapping("/user")
    public @ResponseBody Map<String, String> greetingInBody() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("user", "name");
        return map;
    }
}
