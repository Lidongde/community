package com.lionde.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by lionde on 2022/06/11
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index() {return "index";}
}