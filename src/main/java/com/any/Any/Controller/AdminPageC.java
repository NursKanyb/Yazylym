package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

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
        try {
            URL url = new URL("https://api.telegram.org/bot5331629555:AAFE618hOlG8gqxPrVkejSfA9m2tmAt8ksM/sendMessage?chat_id=636117694&text=" +
                    name + " " + select__ + " " + checkbox+ " " + checkbox_1+ " " + email+ " " + text+ " " + text_1);
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "adminPage";
    }

}
