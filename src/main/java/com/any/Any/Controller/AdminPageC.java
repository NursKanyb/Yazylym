package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPageC {

    @RequestMapping(value = {"/adminPage"}, method = RequestMethod.GET)
    public String page() {
        return "adminPage";
    }

    @RequestMapping(value = {"/adminPage"}, method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String name,@RequestParam(defaultValue = "") String select__,
                        @RequestParam(defaultValue = "") String checkbox,@RequestParam(defaultValue = "") String checkbox_1,
                        @RequestParam(defaultValue = "") String email,@RequestParam(defaultValue = "") String text,
                        @RequestParam(defaultValue = "") String text_1) {
        System.out.println(name);
        return "adminPage";
    }

}
