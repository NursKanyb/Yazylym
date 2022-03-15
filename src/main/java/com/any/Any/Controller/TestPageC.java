package com.any.Any.Controller;

import com.any.Any.Model.AdminM;
import com.any.Any.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class TestPageC {
    @Autowired
    AdminRepo adminRepo;

    @RequestMapping(value = {"/Тест"}, method = RequestMethod.GET)
    public String page(Model model) {
        List<AdminM> temp = (List<AdminM>) adminRepo.findAll();
        Set<AdminM> set = new HashSet<>(temp);
        temp.clear();
        temp.addAll(set);

        model.addAttribute("answer", splitting(temp));
        return "Тест";
    }
    @RequestMapping(value = {"/Тест"}, method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String main, Model model) {
        System.out.println(main);
        return "redirect:/ans";
    }

    private List<String> splitting(List<AdminM> split) {
        List<String> temp = new ArrayList<>();
        String[] parts;
        for (int i = 0; i < split.size(); i++) {
            parts = (split.get(i).getQuestions().split("-"));
            temp.addAll(Arrays.asList(parts));
        }
        Set<String> set = new HashSet<>(temp);
        temp.clear();
        temp.addAll(set);
        return temp;
    }

}
