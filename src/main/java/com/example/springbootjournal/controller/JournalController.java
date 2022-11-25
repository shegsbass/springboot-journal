package com.example.springbootjournal.controller;

import com.example.springbootjournal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {
    @Autowired
    JournalRepository repository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", repository.findAll());
        return "index";
    }

}
