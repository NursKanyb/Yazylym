package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QuesCon {
    List<String> allInfo = new ArrayList<>();

    @RequestMapping(value = {"/Questions"}, method = RequestMethod.GET)
    public String page() {
        return "Questions";
    }

    @RequestMapping(value = "/Questions", method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String email) {
        allInfo.add(name);
        allInfo.add(email);
        return "redirect:/askQues";
    }

    @RequestMapping(value = {"/askQues"}, method = RequestMethod.GET)
    public String pageAskQues() {
        return "askQues";
    }

    @RequestMapping(value = {"/askQues"}, method = RequestMethod.POST)
    public String pageAskQuesP(@RequestParam(defaultValue = "") String select, @RequestParam(defaultValue = "") String checkbox,
                               @RequestParam(defaultValue = "") String radiobutton, @RequestParam(defaultValue = "") String select_1,
                               @RequestParam(defaultValue = "") String select_2, @RequestParam(defaultValue = "") String select_3,
                               @RequestParam(defaultValue = "") String radiobutton_1, @RequestParam(defaultValue = "") String checkbox_1,
                               @RequestParam(defaultValue = "") String select_4, @RequestParam(defaultValue = "") String checkbox_2,
                               @RequestParam(defaultValue = "") String message) {
        System.out.println(select);
        return "askQues";
    }
}
