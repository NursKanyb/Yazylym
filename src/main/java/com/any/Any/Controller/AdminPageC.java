package com.any.Any.Controller;

import com.any.Any.Model.AdminM;
import com.any.Any.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPageC {

    @Autowired
    AdminRepo adminRepo;

    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String page() {
        return "adminPage";
    }

    @RequestMapping(value = {"/admin"}, method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String questions,
                        @RequestParam(defaultValue = "") String diplom, @RequestParam(defaultValue = "") String skill,
                        @RequestParam(defaultValue = "") String moreInfo) {
        AdminM adminM = new AdminM(name, questions, diplom, skill, moreInfo);
        adminRepo.save(adminM);
        return "adminPage";
    }

}
