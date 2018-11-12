package com.javiles.brightbox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrightBoxController
{
    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }

}
