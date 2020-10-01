package org.fasttrackit.birthdays.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TemplateController {

    @GetMapping("index")
    public String index() {
        return "http://localhost:63342/birthdays-web/templates/index.html";
    }

    @GetMapping("login")
    public String login() {
        return "http://localhost:63342/birthdays-web/templates/login.html";
    }
}
