package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.mapper.WorkMapper;
import com.example.realestateaccounting.model.Estate;
import com.example.realestateaccounting.model.Work;
import com.example.realestateaccounting.service.WorkService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/work")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkController {
    WorkService workService;
    WorkMapper workMapper;

    @GetMapping("/index")
    public String getWorkIndex(@RequestParam("workList") List<Work> workList){
        return "workIndex";
    }

    @GetMapping("/list")
    public String getWork(@RequestParam("estate")Estate estate){
        return "work";
    }

}
