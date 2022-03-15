package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainPageC {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String page() {
        return "index";
    }

}
