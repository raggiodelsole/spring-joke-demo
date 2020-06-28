package com.raggiodelsole.raggiojokeapp.controllers;

import com.raggiodelsole.raggiojokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    JokeService jokeService;

    @RequestMapping("/joke")
    public String getJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "jokes/joke";
    }
}
