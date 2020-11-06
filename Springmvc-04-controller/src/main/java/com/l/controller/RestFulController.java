package com.l.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg", "结果为1" + res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg", "结果为2" + res);
        return "test";
    }
}
