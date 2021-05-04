package com.arramos.ResiDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResidentesController {

    @GetMapping("/residentes")
    public String residentes() {
        return "residentes";
    }
}
