package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPageC {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String page() {
        return "login";
    }

}
