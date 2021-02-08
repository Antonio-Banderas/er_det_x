package com.example.demo.controllers;

import com.example.demo.services.DayCompare;
import com.example.demo.services.DayOfWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErDetX {

    DayOfWeek idag = new DayOfWeek();
    DayCompare myComparer = new DayCompare();

    @ResponseBody
    @GetMapping("er_det_x")
    public String ErDetFredagController(@RequestParam String dayQuestion){
        return myComparer.compareDay(idag.getDayOfWeek(),dayQuestion);

    }


}
