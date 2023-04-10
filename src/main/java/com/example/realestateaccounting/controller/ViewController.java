package com.example.realestateaccounting.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
@RequiredArgsConstructor
public class ViewController {

    @GetMapping("/estateIndex")
    public String estateIndex() {
        return "estateIndex";
    }

    @GetMapping("/workIndex")
    public String workIndex() {
        return "workIndex";
    }

    @GetMapping("/estate")
    public String estate() {
        return "estate";
    }

    @GetMapping("/work/new")
    public String newWork() {
        return "newWork";
    }

    @GetMapping("/estate/new")
    public String newEstate() {
        return "newEstate";
    }
}
