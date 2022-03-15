package com.any.Any.Controller;

import com.any.Any.Model.ResumeM;
import com.any.Any.Repo.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResumePageC {
    @Autowired
    ResumeRepo resumeRepo;

    @RequestMapping(value = {"/Резюме"}, method = RequestMethod.GET)
    public String page() {
        return "Резюме";
    }

    @RequestMapping(value = {"/Резюме"}, method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String name,
                        @RequestParam(defaultValue = "") String surname, @RequestParam(defaultValue = "") String email,
                        @RequestParam(defaultValue = "") String address, @RequestParam(defaultValue = "") String phone,
                        @RequestParam(defaultValue = "") String langProf, @RequestParam(defaultValue = "") String education,
                        @RequestParam(defaultValue = "") String hourly, @RequestParam(defaultValue = "") String skills,
                        @RequestParam(defaultValue = "") String moreInfo) {
        ResumeM resumeM = new ResumeM(name, surname, email, address, phone, langProf, education,
                hourly, skills, moreInfo);
        resumeRepo.save(resumeM);

        return "index";
    }

}
