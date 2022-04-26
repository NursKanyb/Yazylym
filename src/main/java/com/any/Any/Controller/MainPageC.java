package com.any.Any.Controller;

import com.any.Any.Model.QuestionsM;
import com.any.Any.Repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainPageC {
    @Autowired
    QuestionsRepo questionsRepo;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String page() {
        QuestionsM questionsM = new QuestionsM("","","","","","","","","","","","","","","");
        questionsRepo.save(questionsM);
        return "index";
    }

}
